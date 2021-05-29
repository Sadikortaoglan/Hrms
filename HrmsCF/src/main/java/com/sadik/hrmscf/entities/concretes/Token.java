package com.sadik.hrmscf.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Entity //Entity oldugunu belirtmek için
@Data //lombok yardımıyla bize getter ve setter ayarlıyor
@Table(name="tokens") //Veri tabanındaki tablonun adını veriyoruz
@AllArgsConstructor  //
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = {"id"})
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "token_description",nullable = false,length = 512)
    private String tokenDescription;

    @OneToOne(mappedBy = "token")
    private  User user;
}
