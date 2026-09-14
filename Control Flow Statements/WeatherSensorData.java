class WeatherSensorData {
    public double temp;
    public double humidity;
    public int rainfall;
    public String sensorID;
    public boolean active;
    public String timestamp;
    
    WeatherSensorData(double t,double h,int r,String sid,boolean act,String ts){
        temp=t;
        humidity=h;
        rainfall=r;
        sensorID=sid;
        active=act;
        timestamp=ts;
    }
    
    public void display(){
        System.out.println("Temperature: "+temp+"c");
        System.out.println("Humidity: "+humidity+"%");
        System.out.println("Rainfall: "+rainfall+"mm");
        System.out.println("SensorID: "+sensorID);
        System.out.println("Active Status: "+active);
        System.out.println("Timestamp: "+timestamp);
    }
    public static void main(String[] args) {
        WeatherSensorData wsd=new WeatherSensorData(28.6,78.2,5,"WX1234",true,"2025-07-24 	14:30:00");
        wsd.display();
    }
}
