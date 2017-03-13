package com.galvanize;

import java.util.List;

/**
 * Created by paul.wang on 3/13/2017.
 */
public interface Addressable {
    List<Address> getAddresses();
    void addAddress(Address address);
}
