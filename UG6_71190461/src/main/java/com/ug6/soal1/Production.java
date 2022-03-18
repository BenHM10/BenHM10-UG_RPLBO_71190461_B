package com.ug6.soal1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/*Produksi android */

public class Production {
    private int productionCapacity;

    private ArrayList<LocalDate> productionDate;

    private double costCalculation = 0.0D;

    public Production(int productionCapacity, ArrayList<LocalDate> productionDate) {
        setProductionCapacity(productionCapacity);
        setProductionDate(productionDate);
    }

    public boolean checkPhonesSpecification(String androidCode) {
        int index = 0;
        boolean status = false;
        for (String androidLevel : Codes.ANDROIDCODES) {
            status = (!androidCode.equalsIgnoreCase(androidLevel) || index >= 3);
            index++;
        }
        return status;
    }

    public boolean checkPhonesSpecification(String androidCode, int ramCapacity, int romCapacity) {
        int index = 0;
        boolean status = false;
        System.out.println("Starting with status " + status);
        for (String androidLevel : Codes.ANDROIDCODES) {
            if (index <= 4 && androidLevel.equalsIgnoreCase(androidCode)) {
                if (ramCapacity <= 8 && ramCapacity >= 1 && romCapacity <= 128 && romCapacity >= 32)
                    status = true;
            } else if (index > 4 && index < Codes.ANDROIDCODES.size() - 1 && androidLevel
                    .equalsIgnoreCase(androidCode)) {
                if (ramCapacity <= 16 && ramCapacity >= 4 && romCapacity <= 256 && romCapacity >= 64)
                    status = true;
            }
            index++;
        }
        System.out.println("Finish checking with status " + status);
        return status;
    }

    public void conductProduction(Phones phone) {
        long productionDuration = getProductionCapacity() * 3L;
        LocalDate today = LocalDate.now();
        getProductionDate().add(today);
        LocalDate productionDueDate = today.plusDays(productionDuration);
        long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
        String todayFormat = today.format(DateTimeFormatter.ISO_DATE);
        String productionDueDateFormat = productionDueDate.format(DateTimeFormatter.ISO_DATE);
        double cost = (getProductionCapacity() * 1000) * daysBetweenProduction;
        setCostCalculation(cost);
        String bonusDate = today.format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String bonusDueDate = productionDueDate.format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
        System.out.println("With code: " + phone.getPhoneCode());
        System.out.println("Production Date: " + todayFormat);
        System.out.println("Production Due date: " + productionDueDateFormat);
        System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
        System.out.println("Calculation Production Cost: Rp " + getCostCalculation());
    }

    public void conductProduction(Phones phone, float productionRate) {
        if (productionRate >= 0.0 && productionRate <= 2.0) {
            long productionDuration = (long) ((float) (getProductionCapacity() * 3L) * productionRate);
            LocalDate today = LocalDate.now();
            getProductionDate().add(today);
            LocalDate productionDueDate = today.plusDays(productionDuration);
            long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
            String todayFormat = today.format(DateTimeFormatter.ISO_DATE);
            String productionDueDateFormat = productionDueDate.format(DateTimeFormatter.ISO_DATE);
            double cost = (getProductionCapacity() * 1000) * daysBetweenProduction * 2.0D;
            setCostCalculation(cost);
            String bonusDate = today.format(
                    DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            String bonusDueDate = productionDueDate.format(
                    DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
            System.out.println("With code: " + phone.getPhoneCode());
            System.out.println("Production Date: " + bonusDate);
            System.out.println("Production Due date: " + bonusDueDate);
            System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
            System.out.println("Calculation Production Cost: Rp " + (long) getCostCalculation());
        } else {
            System.out.println("Please Input valid Production Rate");
        }
    }

    public int getProductionCapacity() {
        return this.productionCapacity;
    }

    public void setProductionCapacity(int productionCapacity) {
        this.productionCapacity = productionCapacity;
    }

    public ArrayList<LocalDate> getProductionDate() {
        return this.productionDate;
    }

    protected void setProductionDate(ArrayList<LocalDate> productionDate) {
        this.productionDate = productionDate;
    }

    public double getCostCalculation() {
        return this.costCalculation;
    }

    public void setCostCalculation(double costCalculation) {
        this.costCalculation = costCalculation;
    }

}
