package com.myapplicationdev.android.tw_listview;

public class Module {

    private String moduleCode;
    private boolean isProj;


    public Module(String moduleCode, boolean isProj) {
        this.moduleCode = moduleCode;
        this.isProj = isProj;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public boolean isProj() {
        return isProj;
    }
}
