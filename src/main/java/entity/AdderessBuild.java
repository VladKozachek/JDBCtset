package entity;

public class AdderessBuild {
    private long id;
    private String country;
    private String city;
    private String street;
    private String postCode;

    AdderessBuild setId(int id){
        this.id=id;
        return this;
    }

    AdderessBuild setCountry(String country){
        this.country=country;
        return this;
    }
    AdderessBuild setCity(String city){
        this.city=city;
        return this;
    }
    AdderessBuild setsSreet(String street){
        this.street=street;
        return this;
    }
    AdderessBuild setPostCode(String postCode){
        this.postCode=postCode;
        return this;
    }
    Addresss build(){
        Addresss addresss=new Addresss();
        addresss.setId(id);
        addresss.setCountry(country);
        addresss.setCity(city);
        addresss.setStreet(street);
        addresss.setPostCode(postCode);
        return addresss;
    }
}
