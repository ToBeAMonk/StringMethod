package com.zhibei.string;

import org.apache.commons.lang3.StringEscapeUtils;
/**
 *转义与不转义
 * @author Administrator
 *
 */
public class UnescapeHtml4 {
	public static void main(String[] args) {
		String s = "<pre class=\"brush: java;\">";
		System.out.println(StringEscapeUtils.escapeHtml4(s));

		String u = "<pre class=\"brush: java;\">";
		System.out.println(StringEscapeUtils.unescapeHtml4(u));
	}
//result:       &lt;pre class=&quot;brush: java;&quot;&gt;
	//          <pre class="brush: java;">
}
