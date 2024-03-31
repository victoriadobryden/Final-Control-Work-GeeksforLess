package com.example.doctors_guide.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecommendedMedications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Changed to Integer
    private Integer diseaseId; // Changed to Integer
    private Integer medicationId; // Changed to Integer
    private Integer recommendedDosingMg;

    // Constructors, getters, and setters...
}