package com.wanhuchina.lock.model.common;


import com.wanhuchina.lock.model.base.BaseDO;

public class CabinetRecord  extends BaseDO implements Comparable {

   



        private String care_id;
        private String order_id;
        private String cabinet_id;
        private String wahoce_id;
        private String care_create_time;
        private String care_query_time;
        private String care_cabinet_status;
        private String care_operator;
        private String care_return_time;
        private String care_return_status;
        /**
         * 2017-2-15增加3个字段用于新板子
         */
        private String care_open_time;
        private String care_clos_time;
        private String care_state_lock;

 


            
    public String getCare_id() {
			return care_id;
		}



		public void setCare_id(String careId) {
			care_id = careId;
		}



		public String getOrder_id() {
			return order_id;
		}



		public void setOrder_id(String orderId) {
			order_id = orderId;
		}



		public String getCabinet_id() {
			return cabinet_id;
		}



		public void setCabinet_id(String cabinetId) {
			cabinet_id = cabinetId;
		}



		public String getWahoce_id() {
			return wahoce_id;
		}



		public void setWahoce_id(String wahoceId) {
			wahoce_id = wahoceId;
		}



		public String getCare_create_time() {
			return care_create_time;
		}



		public void setCare_create_time(String careCreateTime) {
			care_create_time = careCreateTime;
		}



		public String getCare_query_time() {
			return care_query_time;
		}



		public void setCare_query_time(String careQueryTime) {
			care_query_time = careQueryTime;
		}



		public String getCare_cabinet_status() {
			return care_cabinet_status;
		}



		public void setCare_cabinet_status(String careCabinetStatus) {
			care_cabinet_status = careCabinetStatus;
		}



		public String getCare_operator() {
			return care_operator;
		}



		public void setCare_operator(String careOperator) {
			care_operator = careOperator;
		}



		public String getCare_return_time() {
			return care_return_time;
		}



		public void setCare_return_time(String careReturnTime) {
			care_return_time = careReturnTime;
		}



		public String getCare_return_status() {
			return care_return_status;
		}



		public void setCare_return_status(String careReturnStatus) {
			care_return_status = careReturnStatus;
		}



		public String getCare_open_time() {
			return care_open_time;
		}



		public void setCare_open_time(String careOpenTime) {
			care_open_time = careOpenTime;
		}



		public String getCare_clos_time() {
			return care_clos_time;
		}



		public void setCare_clos_time(String careClosTime) {
			care_clos_time = careClosTime;
		}



		public String getCare_state_lock() {
			return care_state_lock;
		}



		public void setCare_state_lock(String careStateLock) {
			care_state_lock = careStateLock;
		}



	public String toString(){
            if(this.getCare_id()==null)
        return "";
      return this.getCare_id()+"";
    }
  

    
    public int compareTo(Object obj){
        CabinetRecord other =(CabinetRecord) obj;
				return this.getCare_id().compareTo(other.getCare_id());
    }
}