package com.jw22.community.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserDTO {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
