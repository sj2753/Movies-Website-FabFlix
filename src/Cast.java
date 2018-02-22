
public class Cast {
	String stageName;
	String filmID;
	
	Cast(String a, String b){
		this.stageName = a;
		this.filmID = b;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getFilmID() {
		return filmID;
	}

	public void setFilmID(String filmID) {
		this.filmID = filmID;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("FID:" + getStageName());
		sb.append(", ");
		sb.append("StageName:" + getFilmID());
		sb.append(".");
		
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filmID == null) ? 0 : filmID.hashCode());
		result = prime * result + ((stageName == null) ? 0 : stageName.hashCode());
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
		Cast other = (Cast) obj;
		if (filmID == null) {
			if (other.filmID != null)
				return false;
		} else if (!filmID.equals(other.filmID))
			return false;
		if (stageName == null) {
			if (other.stageName != null)
				return false;
		} else if (!stageName.equals(other.stageName)) {
			return false;
		}
		return true;
	}

}
