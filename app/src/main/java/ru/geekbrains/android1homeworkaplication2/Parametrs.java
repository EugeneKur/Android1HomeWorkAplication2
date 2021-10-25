package ru.geekbrains.android1homeworkaplication2;

import android.os.Parcel;
import android.os.Parcelable;

public class Parametrs implements Parcelable {
    private String FIRST_NUMBER = "";
    private String SECOND_NUMBER = "";
    private char OPERATION = 'x';
    private double RESULT = 0;

    public Parametrs() {

    }

    public Parametrs(String FIRST_NUMBER, String SECOND_NUMBER, char OPERATION, double RESULT) {
        this.FIRST_NUMBER = FIRST_NUMBER;
        this.SECOND_NUMBER = SECOND_NUMBER;
        this.OPERATION = OPERATION;
        this.RESULT = RESULT;
    }

    protected Parametrs(Parcel in) {
        FIRST_NUMBER = in.readString();
        SECOND_NUMBER = in.readString();
        OPERATION = (char) in.readInt();
        RESULT = in.readDouble();
    }

    public static final Creator<Parametrs> CREATOR = new Creator<Parametrs>() {
        @Override
        public Parametrs createFromParcel(Parcel in) {
            return new Parametrs(in);
        }

        @Override
        public Parametrs[] newArray(int size) {
            return new Parametrs[size];
        }
    };

    public String getFIRST_NUMBER() {
        return FIRST_NUMBER;
    }

    public void setFIRST_NUMBER(String FIRST_NUMBER) {
        this.FIRST_NUMBER = FIRST_NUMBER;
    }

    public String getSECOND_NUMBER() {
        return SECOND_NUMBER;
    }

    public void setSECOND_NUMBER(String SECOND_NUMBER) {
        this.SECOND_NUMBER = SECOND_NUMBER;
    }

    public char getOPERATION() {
        return OPERATION;
    }

    public void setOPERATION(char OPERATION) {
        this.OPERATION = OPERATION;
    }

    public double getRESULT() {
        return RESULT;
    }

    public void setRESULT(double RESULT) {
        this.RESULT = RESULT;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(FIRST_NUMBER);
        dest.writeString(SECOND_NUMBER);
        dest.writeInt((int) OPERATION);
        dest.writeDouble(RESULT);
    }
}
