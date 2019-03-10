package co.finalfour.beerme.entity.beer;

import java.util.List;

public class BreweryResponse{
	
   	private Integer currentPage;
   	private List<Brewery> data;
   	private Integer numberOfPages;
   	private String status;
   	private Integer totalResults;

 	public Integer getCurrentPage(){
		return this.currentPage;
	}
	
 	public void setCurrentPage(Integer currentPage){
		this.currentPage = currentPage;
	}
 	
 	public List<Brewery> getData(){
		return this.data;
	}
	
 	public void setData(List<Brewery> data){
		this.data = data;
	}
 	
 	public Integer getNumberOfPages(){
		return this.numberOfPages;
	}
	
 	public void setNumberOfPages(Integer numberOfPages){
		this.numberOfPages = numberOfPages;
	}
 	
 	public String getStatus(){
		return this.status;
	}
	
 	public void setStatus(String status){
		this.status = status;
	}
 	
 	public Integer getTotalResults(){
		return this.totalResults;
	}
	
 	public void setTotalResults(Integer totalResults){
		this.totalResults = totalResults;
	}
	
	@Override
	public String toString() {
		return "BreweryResponse [currentPage=" + currentPage + ", data=" + data + ", numberOfPages=" + numberOfPages
				+ ", status=" + status + ", totalResults=" + totalResults + "]";
	}
	
}
