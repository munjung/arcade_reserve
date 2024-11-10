package com.example.reserve.crossfit.user.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "tb_user_info")
@Comment("사용자 정보 테이블")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Comment("sequence")
    private Long id;

    @Column(name = "phone", unique = true, nullable = false)
    @Comment("전화번호")
    private String phone;

    @Column(name = "name", nullable = false)
    @Comment("이름")
    private String name;

    @Column(name = "password", nullable = false)
    @Comment("패스워드")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    @Comment("사용자 역할 구분")
    private Role role;

    public enum Role {
        USER, ADMIN
    }

}
