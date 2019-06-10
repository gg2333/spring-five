package me.master.springfive.data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class Profile implements Serializable {

    @Id
    private String id;

    private String avatar;
    private String signature;

    /* 双向绑定 */
//    @OneToOne
//    @JoinColumn(name = "id", referencedColumnName = "profile_id")
//    private User user;


    public Profile() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Profile(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

}
