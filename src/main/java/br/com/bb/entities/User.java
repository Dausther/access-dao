package br.com.bb.entities;

import br.com.bb.persistence.core.Persistent;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User implements Persistent<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USERID")
    private Long userId;
    @Column(name = "USERNAME")
    private String userName;
    @Version
    private long version;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public Long getId() {
        return userId;
    }

    @Override
    public long getVersion() {
        return version;
    }
}
