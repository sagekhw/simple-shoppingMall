package shop.simple.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(exclude = {"member"})
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;
    private String status;
    private String city;
    private String street;
    private int zipcode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    public void addMember(Member member){
        this.member = member;
        member.getAddresses().add(this);
    }

}
