/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author HP
 */
@Entity(name = "Ban")
public class BAN {
    @Id
    private long BanID;
    private String Ten;
    private String Image;

    public long getBanID() {
        return BanID;
    }

    public void setBanID(long BanID) {
        this.BanID = BanID;
    }

    public BAN() {
    }

    public BAN(long BanID, String Ten, String Image) {
        this.BanID = BanID;
        this.Ten = Ten;
        this.Image = Image;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }
}
