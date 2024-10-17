package com.lunchapp.lunchgrouprandomizer.service;

import com.lunchapp.lunchgrouprandomizer.domain.User;
import com.lunchapp.lunchgrouprandomizer.dto.CreateUserCommand;
import com.lunchapp.lunchgrouprandomizer.dto.UserInfo;
import com.lunchapp.lunchgrouprandomizer.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional
public class UserService {

    private UserRepository userRepository;

    private ModelMapper modelMapper;

    @Autowired
    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public UserInfo userCreator(CreateUserCommand command) {
        User user = modelMapper.map(command, User.class);

        userRepository.save(user);
        user.setIsInOffice(false);

        return modelMapper.map(user, UserInfo.class);
    }
}
