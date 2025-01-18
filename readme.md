import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.client.web.OAuth2LoginAuthenticationFilter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomOAuth2SuccessHandler implements AuthenticationSuccessHandler {

    private final UserRepository userRepository;

    public CustomOAuth2SuccessHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onAuthenticationSuccess(
        HttpServletRequest request,
        HttpServletResponse response,
        OAuth2AuthenticationToken authentication
    ) throws IOException {
        // Extract user attributes
        Map<String, Object> attributes = authentication.getPrincipal().getAttributes();

        String name = (String) attributes.get("name");
        String email = (String) attributes.get("email");
        String picture = (String) attributes.get("picture");

        // Save or update user in the database
        User user = userRepository.findByEmail(email);
        if (user == null) {
            user = new User();
        }
        user.setName(name);
        user.setEmail(email);
        user.setPicture(picture);

        userRepository.save(user);

        // Redirect to the homepage or dashboard
        response.sendRedirect("/dashboard");
    }
}
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    private final UserRepository userRepository;

    public SecurityConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .oauth2Login(oauth2 -> oauth2
                .successHandler(new CustomOAuth2SuccessHandler(userRepository))
            )
            .authorizeRequests(authorize -> authorize
                .anyRequest().authenticated()
            );

        return http.build();
    }
}


@Override
public void onAuthenticationSuccess(
HttpServletRequest request,
HttpServletResponse response,
OAuth2AuthenticationToken authentication
) throws IOException {
String email = (String) authentication.getPrincipal().getAttributes().get("email");
String token = generateToken(email);

    response.sendRedirect("http://localhost:3000/home?token=" + token);
}


import jwtDecode from "jwt-decode";

const token = new URLSearchParams(window.location.search).get("token");
if (token) {
const user = jwtDecode(token);
console.log(user);
}




