package com.application.employee.fcatorydesignepattern;


class GetPlanFactory{

    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTIC")) {
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIAL")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONAL")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
