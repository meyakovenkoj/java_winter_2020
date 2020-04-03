package ru.yakovenko;

public class Window {
    int [] avalibleOptions;
    Applicant inProcess;

    public Window(int [] options){

    }

    public void setAvalibleOptions(int[] avalibleOptions) {
        this.avalibleOptions = avalibleOptions;
    }

    public int[] getAvalibleOptions() {
        return avalibleOptions;
    }

    public Applicant callVisitor(Queue queue){
        Applicant vistor = null;
        return vistor;
    }

    public void setInProcess(Applicant inProcess) {
        this.inProcess = inProcess;
    }
}
