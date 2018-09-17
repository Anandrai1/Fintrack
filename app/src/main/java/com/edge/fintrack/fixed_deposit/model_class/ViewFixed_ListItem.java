package com.edge.fintrack.fixed_deposit.model_class;

import android.graphics.drawable.Drawable;

public class ViewFixed_ListItem {
    private Drawable dImage;
    private String dRefNo;
    private String dFDNo;
    private String dSName;
    private String dInterest;
    private String dInvestDate;
    private String dInvestAmount;
    private String dIFirstYear;
    private String dIThirdYear;
    private String dIFifthYear;
    private String dISrCitizen;

    public ViewFixed_ListItem(Drawable dImage, String dSName, String dInvestAmount, String dInterest, String dInvestDate, String dRefNo, String dFDNo) {
        this.dImage = dImage;
        this.dRefNo = dRefNo;
        this.dFDNo = dFDNo;
        this.dSName = dSName;
        this.dInterest = dInterest;
        this.dInvestDate = dInvestDate;
        this.dInvestAmount = dInvestAmount;
    }

    public ViewFixed_ListItem() {
    }

    public Drawable getdImage() {
        return dImage;
    }

    public void setdImage(Drawable dImage) {
        this.dImage = dImage;
    }

    public String getdRefNo() {
        return dRefNo;
    }

    public void setdRefNo(String dRefNo) {
        this.dRefNo = dRefNo;
    }

    public String getdFDNo() {
        return dFDNo;
    }

    public void setdFDNo(String dFDNo) {
        this.dFDNo = dFDNo;
    }

    public String getdSName() {
        return dSName;
    }

    public void setdSName(String dSName) {
        this.dSName = dSName;
    }

    public String getdInterest() {
        return dInterest;
    }

    public void setdInterest(String dInterest) {
        this.dInterest = dInterest;
    }

    public String getdInvestDate() {
        return dInvestDate;
    }

    public void setdInvestDate(String dInvestDate) {
        this.dInvestDate = dInvestDate;
    }

    public String getdInvestAmount() {
        return dInvestAmount;
    }

    public void setdInvestAmount(String dInvestAmount) {
        this.dInvestAmount = dInvestAmount;
    }

    public String getdIFirstYear() {
        return dIFirstYear;
    }

    public void setdIFirstYear(String dIFirstYear) {
        this.dIFirstYear = dIFirstYear;
    }

    public String getdIThirdYear() {
        return dIThirdYear;
    }

    public void setdIThirdYear(String dIThirdYear) {
        this.dIThirdYear = dIThirdYear;
    }

    public String getdIFifthYear() {
        return dIFifthYear;
    }

    public void setdIFifthYear(String dIFifthYear) {
        this.dIFifthYear = dIFifthYear;
    }

    public String getdISrCitizen() {
        return dISrCitizen;
    }

    public void setdISrCitizen(String dISrCitizen) {
        this.dISrCitizen = dISrCitizen;
    }
}
