package shop.simple.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = {"addresses"})
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;
    private String email;

    @OneToMany(mappedBy = "member",fetch = FetchType.LAZY)
    private List<Address> addresses = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    public Member(String email) {
        this.email = email;
    }

    public void addCompany(Company company){
        this.company = company;
        company.getMembers().add(this);
    }
}
