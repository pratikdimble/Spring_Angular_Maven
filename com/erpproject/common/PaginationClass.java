package com.erpproject.common;

public class PaginationClass
	{

		private Integer offset;
		private Long recordCount;
		
		public Integer getOffset()
			{
				return offset;
			}
		public void setOffset(Integer offset)
			{
				this.offset = offset;
			}
		public Long getRecordCount()
			{
				return recordCount;
			}
		public void setRecordCount(Long recordCount)
			{
				this.recordCount = recordCount;
			}

	}
