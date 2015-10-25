package gsu.ugahacksproject;

import com.clarifai.api.ClarifaiClient;

public class ClarifaiInstance{
	private ClarifaiClient clarifai;

	public ClarifaiInstance(String APP_ID, String APP_PASS){
		clarifai = new ClarifaiClient(APP_ID, APP_PASS);
	} 
}