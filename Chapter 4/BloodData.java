class BloodData {
      static String bloodType, rhFactor;
      
   public BloodData() {
      defaultPatient();
   }
   
   public void defaultPatient() {
      this.bloodType = "A";
      this.rhFactor = "-";
   }
   
   public void setBlood(String bloodType) {
      this.bloodType = bloodType;
   }
   
   public void setRh(String rhFactor) {
      this.rhFactor = rhFactor;
   }

   public String getBlood() {
       return this.bloodType;    
   }
   
   public String getRh() {
       return this.rhFactor;
   }
        
   public void displayBloodInfo() {
      System.out.println("Your blood type is: " +bloodType);
      System.out.println("Your Rh Factor is: " +rhFactor);
   }
   
}