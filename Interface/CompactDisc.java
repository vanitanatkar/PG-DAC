package Study.Interface;

public class CompactDisc implements Sellable {
	//Name,  music/video  , cost , duration , artist  ( properties , 2 constructors, getters, setters, toString )
   private String CDname;
   private String storageformat;//mp4,mp3
   private float cost;
   private String artist;
   
   public CompactDisc() {
	   System.out.println("Compact Disc No parameter constructor called:");
   }

public CompactDisc(String cDname, String storageformat, float cost, String artist) {
	this.CDname = cDname;
	this.storageformat = storageformat;
	this.cost = cost;
	this.artist = artist;
}

public String getCDname() {
	return CDname;
}

public void setCDname(String cDname) {
	CDname = cDname;
}

public String getStorageformat() {
	return storageformat;
}

public void setStorageformat(String storageformat) {
	this.storageformat = storageformat;
}

public float getCost() {
	return cost;
}

public void setCost(float cost) {
	this.cost = cost;
}

public String getArtist() {
	return artist;
}

public void setArtist(String artist) {
	this.artist = artist;
}
   @Override
public String toString() {
	   String cd="cdname:"+CDname+", storageFormat:"+storageformat+",cost:"+cost+", artist:"+artist;
	return cd;
}

@Override
public double getSellingPrice() {
	double gsf=cost-getDiscount();
	return gsf;
}

@Override
public double getDiscount() {
	double d=0.15*cost;
	return d;
}
}
