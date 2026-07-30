package com.aniket.spring_boot_rest.model;

import java.util.List;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor  // Necessary for Spring instantiation & Jackson JSON parsing
@AllArgsConstructor // Generates the 5-argument constructor needed by JobRepo
@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;
}
