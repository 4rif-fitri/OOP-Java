/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Victus
 */
public class ImageObj {
   public String url;
	public String name;

ImageObj(String url, String name){
	this.url = url;
	this.name = name;
}

	public void setUrl(String url){
		this.url = url;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl(){
		return this.url;
	}
	public String getName() {
		return this.name;
	}

}
