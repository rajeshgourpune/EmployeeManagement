package com.application.employee.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@EntityListeners(AuditingEntityListener.class)
public class Employee implements java.io.Serializable {

    private static final long serialVersionUID = 1234567L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        @Column(name = "name")
        private String name;

        @Column(name = "city")
        private String city;

        @Column(name = "state")
        private String state;

        public Employee() {
            }

	    public Employee(Integer id, String name, String city, String state) {
            this.id = id;
            this.name = name;
            this.city = city;
            this.state = state;
        }


        public int getId() {
        return this.id;
    }

        public void setId(Integer id) {
        this.id = id;
    }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return this.city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return this.state;
        }
    
        public void setState(String state) {
            this.state = state;
        }

        @Override
        public String toString() {
            return "Stock [id=" + id + ",name=" + name + ", city=" + city
                    + ", state=" + state + "]";
        }
}
