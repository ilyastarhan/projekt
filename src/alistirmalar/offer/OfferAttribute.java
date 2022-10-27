package alistirmalar.offer;

public class OfferAttribute {
    String location, companyName, jobTitle;
    double salary;
    boolean hasBenefit, hasPTO, isWFH, isFullTime;

   OfferAttribute(){

   }
   public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime){
       this.location = location;
       this.companyName = companyName;
       this.jobTitle = jobTitle;
       this.salary = salary;
       this.hasBenefit = hasBenefit;
       this.hasPTO = hasPTO;
       this.isWFH = isWFH;
       this.isFullTime = isFullTime;

   }

    @Override
    public String toString() {
        return "OfferAttribute{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
    public void notFullTime(String notFullTime){


    }
}

