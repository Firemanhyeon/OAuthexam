package org.blog.oauthexam.realprojectexam.service;

import lombok.RequiredArgsConstructor;
import org.blog.oauthexam.realprojectexam.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

}
