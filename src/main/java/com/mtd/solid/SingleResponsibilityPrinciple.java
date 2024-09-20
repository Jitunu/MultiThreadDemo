package com.mtd.solid;

public class SingleResponsibilityPrinciple {

    class Invoice {
        int price;
        int quantity;
        Invoice(int price, int quantity) {
            this.price = price;
            this.quantity = quantity;
        }

        public int calculateTotalPrice(int price, int quantity){
            return price*quantity;
        }
    }

    class PrintInvoice {
        Invoice invoice;
        PrintInvoice(Invoice invoice) {
            this.invoice = invoice;
        }
        public void printInvoice(){
            System.out.println("Printed successfully");
        }
    }

    class SaveInvoice {
        Invoice invoice;
        SaveInvoice(Invoice invoice) {
            this.invoice = invoice;
        }
        public void saveInvoice(){
            System.out.println("Save successfully");
        }
    }
    public static void main(String[] args) {

    }
}
