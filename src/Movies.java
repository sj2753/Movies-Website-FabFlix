
public class Movies {


	private String Director;
	private String Title;
	private String YearRelease;
	private String Genre;
	private String fid;

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public Movies(String Director, String Title, String YearRelease, String Genre, String fid){
		this.Director=Director;
		this.Title=Title;
		this.YearRelease=YearRelease;
		this.Genre=Genre;
	}
	
	public  String getDirector(){
		return this.Director;
	}
	
	public void setDirector(String Director){
		this.Director=Director;
	}

	public  String getTitle(){
		return this.Title;
	}

	public void seTitle(String Title){
		this.Title=Title;
	}
	
	public  String getYearRelease(){
		return this.YearRelease;
	}
	public void setYearRelease(String YearRelease){
		this.YearRelease=YearRelease;
	}

	public  String getGenre(){
		return this.Genre;
	}
	
	public void setGenre(String Genre){
		this.Genre=Genre;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Employee Details - ");
		sb.append("Name:" + getDirector());
		sb.append(", ");
		sb.append("Title:" + getTitle());
		sb.append(", ");
		sb.append("YearRelease:" + getYearRelease());
		sb.append(", ");
		sb.append("Genre:" + getGenre());
		sb.append(".");
		
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Director == null) ? 0 : Director.hashCode());
		result = prime * result + ((Genre == null) ? 0 : Genre.hashCode());
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
		result = prime * result + ((YearRelease == null) ? 0 : YearRelease.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movies other = (Movies) obj;
		if (Director == null) {
			if (other.Director != null)
				return false;
		} else if (!Director.equals(other.Director))
			return false;
		if (Genre == null) {
			if (other.Genre != null)
				return false;
		} else if (!Genre.equals(other.Genre))
			return false;
		if (Title == null) {
			if (other.Title != null)
				return false;
		} else if (!Title.equals(other.Title))
			return false;
		if (YearRelease == null) {
			if (other.YearRelease != null)
				return false;
		} else if (!YearRelease.equals(other.YearRelease))
			return false;
		return true;
	}	
	
}
