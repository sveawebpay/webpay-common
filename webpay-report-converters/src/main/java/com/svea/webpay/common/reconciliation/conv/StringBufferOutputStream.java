package com.svea.webpay.common.reconciliation.conv;

import java.io.IOException;
import java.io.OutputStream;

public class StringBufferOutputStream extends OutputStream {

    // the target buffer
        protected StringBuffer buffer;
    
        /**
         * Create an output stream that writes to the target StringBuffer
         *
         * @param out    The wrapped output stream.
         */
        public StringBufferOutputStream(StringBuffer out) {
            buffer = out;
        }
    
    
        // in order for this to work, we only need override the single character form, as the others
        // funnel through this one by default.
        public void write(int ch) throws IOException {
            // just append the character
            buffer.append((char)ch);
        }
        
        public StringBuffer getBuffer() {
        	return buffer;
        }
	
}
