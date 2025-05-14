package vn.huy.service;

import vn.huy.controller.request.SignInRequest;
import vn.huy.controller.response.TokenResponse;

public interface AuthenticationService {

    TokenResponse getAccessToken(SignInRequest request);

    TokenResponse getRefreshToken(String request);
}
