package predictive;

public class WordSig implements Comparable<WordSig> {

	private String word;
	private String signature;

	public WordSig(String word) {
		this.word = word;
		this.signature = PredictivePrototype.wordToSignature(word);
	}

	public WordSig(String word, String signature) {
		this.word = word;
		this.signature = signature;
	}

	/**
	 * 
	 * @return
	 */
	public String getWord() {
		return word;
	}

	/**
	 * 
	 * @return
	 */
	public String getSignature() {
		return signature;
	}


	@Override
	public int compareTo(WordSig ws) {
		
	

		return 0;
	}

}
