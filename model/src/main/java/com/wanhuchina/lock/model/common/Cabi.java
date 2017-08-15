package com.wanhuchina.lock.model.common;

import com.wanhuchina.lock.model.base.BaseDO;

public class Cabi extends BaseDO implements Comparable {

   



        private String cabi_id;
        private String waho_id;
        private String cabinet_no;
        private String cabi_isdel;
        private String cabi_last_access_time;

  


            
    public String getCabi_id() {
			return cabi_id;
		}



		public void setCabi_id(String cabiId) {
			cabi_id = cabiId;
		}



		public String getWaho_id() {
			return waho_id;
		}



		public void setWaho_id(String wahoId) {
			waho_id = wahoId;
		}



		public String getCabinet_no() {
			return cabinet_no;
		}



		public void setCabinet_no(String cabinetNo) {
			cabinet_no = cabinetNo;
		}



		public String getCabi_isdel() {
			return cabi_isdel;
		}



		public void setCabi_isdel(String cabiIsdel) {
			cabi_isdel = cabiIsdel;
		}



		public String getCabi_last_access_time() {
			return cabi_last_access_time;
		}



		public void setCabi_last_access_time(String cabiLastAccessTime) {
			cabi_last_access_time = cabiLastAccessTime;
		}



	@Override
	public String toString() {
		return "Cabi [cabi_id=" + cabi_id + ", cabi_isdel=" + cabi_isdel
				+ ", cabi_last_access_time=" + cabi_last_access_time
				+ ", cabinet_no=" + cabinet_no + ", waho_id=" + waho_id + "]";
	}
  

    
    public int compareTo(Object obj){
        Cabi other =(Cabi) obj;
				return this.getCabi_id().compareTo(other.getCabi_id());
    }
    
    
    
}