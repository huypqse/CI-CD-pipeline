package vn.huy.service;

import vn.huy.controller.request.UserCreationRequest;
import vn.huy.controller.request.UserPasswordRequest;
import vn.huy.controller.request.UserUpdateRequest;
import vn.huy.controller.response.UserPageResponse;
import vn.huy.controller.response.UserResponse;

public interface UserService {

    UserPageResponse findAll(String keyword, String sort, int page, int size);

    UserResponse findById(Long id);

    UserResponse findByUsername(String username);

    UserResponse findByEmail(String email);

    long save(UserCreationRequest req);

    void update(UserUpdateRequest req);

    void changePassword(UserPasswordRequest req);

    void delete(Long id);
}
