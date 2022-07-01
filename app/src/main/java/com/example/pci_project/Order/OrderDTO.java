package com.example.pci_project.Order;

public class OrderDTO {

    private int imag_url;
    private String name;

    public OrderDTO(int imag_url, String name) {
        this.imag_url = imag_url;
        this.name = name;
    }

    public int getImag_url() {
        return imag_url;
    }

    public void setImag_url(int imag_url) {
        this.imag_url = imag_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
