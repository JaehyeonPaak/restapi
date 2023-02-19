package com.restapi.app.ws.ui.service;

import com.restapi.app.ws.shared.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto user);
}
