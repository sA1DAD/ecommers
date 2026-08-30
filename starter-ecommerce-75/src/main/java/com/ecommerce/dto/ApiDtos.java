package com.ecommerce.dto;
import com.ecommerce.entity.Role;
import jakarta.validation.constraints.*;

public final class ApiDtos {
 private ApiDtos(){}
 public record RegisterRequest(@NotBlank String firstName,@NotBlank String lastName,@Email @NotBlank String email,@NotBlank @Size(min=3,max=30) String username,@NotBlank @Size(min=6) String password,@NotNull Role role){}
 public record LoginRequest(@NotBlank String username,@NotBlank String password){}
 public record UserResponse(Long id,String firstName,String lastName,String email,String username,Role role){}
 public record AuthResponse(String token,UserResponse user){}
 public record ProductRequest(@NotBlank String brand,@NotBlank String model,@NotBlank String category,@NotBlank @Size(max=2000) String description,@Positive double price,@Min(0) @Max(5) int rating,@NotBlank String imageUrl){}
 public record ProductResponse(Long id,String brand,String model,String category,String description,double price,int rating,String imageUrl,String sellerUsername){}
 public record ContactRequest(@NotBlank String name,@Email @NotBlank String email,String phone,@NotBlank @Size(max=3000) String message){}
}
