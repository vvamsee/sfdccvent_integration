package cors.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * provides cors origin access  
 * 
 * @author Gopala krishna reddy 
 *
 */
public class CORSFilter implements Filter{
		//public static JdbcTemplate jdbcTemplate;
		
		@Override
	    public void init(FilterConfig arg0) throws ServletException {}
	    @Override
	    public void doFilter(ServletRequest req, ServletResponse resp,
	            FilterChain chain) throws IOException, ServletException {
	    	 HttpServletRequest request = null;
	    
	    	
	        // TODO Auto-generated method stub
	        HttpServletResponse response=(HttpServletResponse) resp;
	        request=(HttpServletRequest) req;
	        
	        response.setHeader("Access-Control-Allow-Origin", "*");
	        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
	        response.setHeader("Access-Control-Max-Age", "3600"); 
	        response.setHeader("Access-Control-Allow-Headers", "*");
	 
			chain.doFilter(request, response);
	    }
	 
	    @Override
	    public void destroy() {}
	    
	   
}
