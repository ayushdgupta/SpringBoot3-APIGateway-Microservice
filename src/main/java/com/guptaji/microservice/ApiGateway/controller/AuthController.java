//package com.guptaji.microservice.ApiGateway.controller;
//
//import com.guptaji.microservice.ApiGateway.model.AuthResponse;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
//import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
//import org.springframework.security.oauth2.core.oidc.user.OidcUser;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//
//    Logger LOG = LogManager.getLogger(AuthController.class);
//
//    @GetMapping("/login")
//    public ResponseEntity<?> login(
//            @RegisteredOAuth2AuthorizedClient("okta")OAuth2AuthorizedClient client,
//            @AuthenticationPrincipal OidcUser user, Model model){
//        AuthResponse authResponse = new AuthResponse();
//        authResponse.setUserId(user.getEmail());
//        authResponse.setAccessToken(client.getAccessToken().getTokenValue());
//        authResponse.setRefreshToken(client.getRefreshToken().getTokenValue());
//        authResponse.setExpiresAt(client.getAccessToken().getExpiresAt().getEpochSecond());
//
//        List<String> authorities = user.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList());
//
//        authResponse.setAuthorities(authorities);
//        return new ResponseEntity<>(authorities, HttpStatus.OK);
//    }
//}
