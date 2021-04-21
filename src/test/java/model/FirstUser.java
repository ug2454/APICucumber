package model;

public class FirstUser {

    /**
     * firstName : Sherlock
     * lastName : Holmes
     * address : {"address":"Baker St","phone":123456789,"email":"221b@gmail.com"}
     */

    private String firstName;
    private String lastName;
    /**
     * address : Baker St
     * phone : 123456789
     * email : 221b@gmail.com
     */

    private AddressBean address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public static class AddressBean {
        private String address;
        private int phone;
        private String email;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getPhone() {
            return phone;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
