package org.example;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CloneableTest {
    public class Address {
        private String principal;
        private String secondary;
        private String complement;

        public Address(String principal, String secondary, String complement) {
            this.principal = principal;
            this.secondary = secondary;
            this.complement = complement;
        }

        public Address() {

        }

        public String getPrincipal() {
            return principal;
        }

        public Address setPrincipal(String principal) {
            this.principal = principal;
            return this;
        }

        public String getSecondary() {
            return secondary;
        }

        public Address setSecondary(String secondary) {
            this.secondary = secondary;
            return this;
        }

        public String getComplement() {
            return complement;
        }

        public Address setComplement(String complement) {
            this.complement = complement;
            return this;
        }

        @Override
        public Address clone() {
            return new Address(this.principal, this.secondary, this.complement);
        }

    }
    public class Locate {
        private String country;
        private String city;
        private String postalCode;
        private Address address;

        public Locate(String country, String city, String postalCode, Address address) {
            this.country = country;
            this.city = city;
            this.postalCode = postalCode;
            this.address = address;
        }

        public Locate()  {

        }

        public String getCountry() {
            return country;
        }

        public Locate setCountry(String country) {
            this.country = country;
            return this;
        }

        public String getCity() {
            return city;
        }

        public Locate setCity(String city) {
            this.city = city;
            return this;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public Locate setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Address getAddress() {
            return address;
        }

        public Locate setAddress(Address address) {
            this.address = address;
            return this;
        }

        @Override
        public Locate clone() {
            return new Locate(this.country, this.city, this.postalCode, this.address.clone());
        }

    }
    public class Person {
        private String firstName;
        private String lastName;
        private Locate locate;

        public Person(String firstName, String lastName, Locate locate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.locate = locate;
        }

        public Person() {

        }

        public String getFirstName() {
            return firstName;
        }

        public Person setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public Person setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Locate getLocate() {
            return locate;
        }

        public Person setLocate(Locate locate) {
            this.locate = locate;
            return this;
        }

        @Override
        public Person clone() {
            return new Person(this.firstName, this.lastName, this.locate.clone());
        }
    }


    private Person person;

    @BeforeAll
    public void setUp() {
        Address address = new Address()
                .setPrincipal("Cra 19A")
                .setSecondary("Calle 135")
                .setComplement("11");
        Locate locate = new Locate()
                .setCountry("Colombia")
                .setCity("Bogotá")
                .setPostalCode("1111")
                .setAddress(address);
        this.person = new Person()
                .setFirstName("Cristian")
                .setLastName("Aguilera")
                .setLocate(locate);
    }

    @Test
    public void cloneableTest() {
        Person person2 = this.person.clone();
    }

}
