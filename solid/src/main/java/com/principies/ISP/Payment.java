package com.principies.ISP;

public interface Payment {
    public void calculatePayment();
    public void creditCardPayment();
    public void bankTransferPayment();
    public void cashPayment();
}

