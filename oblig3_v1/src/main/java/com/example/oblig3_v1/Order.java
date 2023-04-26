package com.example.oblig3_v1;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private String movie;
    private int amount;
    private String name;
    private String phone;
    private String email;

    public String toString() {
        return "Order{" +
                "id="+ id +
                ", Movie='"+ movie +"'\n" +
                ", amount="+amount+
                ", name='"+name+"'\n"+
                ", phone='"+phone+"'\n"+
                ", email='"+email+"'\n"+
                "}";
    }
}
