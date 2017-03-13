package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paul.wang on 3/13/2017.
 */
public class Business implements Addressable {

    public String getName() {
        return name;
    }

    private String name;
    private List<Address> addresses;

    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public void addAddress(Address address) {
        addresses.add(address);
    }

    public Business(String name) {
        this.name = name;
        addresses = new ArrayList<>();
    }

    private Business() {

    }


}
