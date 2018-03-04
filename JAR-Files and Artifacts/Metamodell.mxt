<?xml version="1.0" encoding="UTF-8"?>
<gxl dbName="PESTEListar" dbPath="c:\Users\metaedit\Documents\MetaEdit+ 5.5\PESTEListar" timeStamp="2018-02-26T17:12:50.902Z" version="5.5" xmlns="http://www.metacase.com/gxlGOPRRType" xmlns:sym="http://www.metacase.com/symbol">
	<graph id="Graph_ActorBoundary_Eva_3683465966" type="Graph_ActorBoundary_Eva_3683465966" typeName="ActorBoundary">
		<description></description>
		<superType>
			<graph id="Graph_Boundary_Eva_3674411585" type="Graph_Boundary_Eva_3674411585" typeName="Boundary">
				<description></description>
				<object id="Object_Task_user_3670397845" type="Object_Task_user_3670397845" typeName="Task">
					<description></description>
					<slot id="a1wtma" name="Name" unique="false">
						<property id="Property_Name_user_3669789122" type="Property_Name_user_3669789122" typeName="Name">
							<description>Only the following characters are allowed: 
a-z, A-Z, whitespace</description>
							<dataType>
								<simpleType>String</simpleType>
							</dataType>
							<defaultValue>
								<string></string>
							</defaultValue>
							<regex>[a-zA-Z\s]+</regex>
							<widget>Input Field</widget>
						</property>
					</slot>
					<slot id="a2pvpg" name="Opportunity" unique="false">
						<property id="Property_Opportunity_Eva_3676441423" type="Property_Opportunity_Eva_3676441423" typeName="Opportunity">
							<description></description>
							<dataType>
								<simpleType>Boolean</simpleType>
							</dataType>
							<defaultValue>
								<bool>false</bool>
							</defaultValue>
						</property>
					</slot>
					<slot id="a3pvpn" name="Threat" unique="false">
						<property id="Property_Threat_Eva_3676441474" type="Property_Threat_Eva_3676441474" typeName="Threat">
							<description></description>
							<dataType>
								<simpleType>Boolean</simpleType>
							</dataType>
							<defaultValue>
								<bool>false</bool>
							</defaultValue>
						</property>
					</slot>
					<identProp slotID="a1wtma"></identProp>
					<objectSymbol offset="80,50" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
						<defaultConnectable isSticky="true" points="80,70 95.3846,50 164.615,50 180,70 164.615,90 95.3846,90 80,70" targetPointX="130" targetPointY="70" usesGrid="false"></defaultConnectable>
						<svg baseProfile="tiny" height="90" version="1.2" width="180" xmlns="http://www.w3.org/2000/svg">
							<polygon fill="none" points="80,70 95.3846,50 164.615,50 180,70 164.615,90 95.3846,90" stroke="rgb(0,0,0)" stroke-width="1">
								<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
							</polygon>
							<polygon fill="rgb(192,255,128)" points="80,70 95.3846,50 164.615,50 180,70 164.615,90 95.3846,90" stroke="rgb(0,0,0)" stroke-width="1">
								<metaInfo xmlns="http://www.metacase.com/symbol">
									<displayCondition conditionOperator="=" matchString="T" xmlns="http://www.w3.org/2000/svg">PropertyTextSource:a2pvpg</displayCondition>
								</metaInfo>
							</polygon>
							<polygon fill="rgb(255,192,192)" points="80,70 95.3846,50 164.615,50 180,70 164.615,90 95.3846,90" stroke="rgb(0,0,0)" stroke-width="1">
								<metaInfo xmlns="http://www.metacase.com/symbol">
									<displayCondition conditionOperator="=" matchString="T" xmlns="http://www.w3.org/2000/svg">PropertyTextSource:a3pvpn</displayCondition>
								</metaInfo>
							</polygon>
							<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="40" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="80" x="90" y="50">
								PropertyTextSource:a1wtma
								<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
							</textArea>
						</svg>
					</objectSymbol>
					<icon offset="80,50" xmlns="http://www.metacase.com/icon">
						<svg baseProfile="tiny" height="90" version="1.2" width="180" xmlns="http://www.w3.org/2000/svg">
							<polygon fill="none" points="80,70 95.3846,50 164.615,50 180,70 164.615,90 95.3846,90" stroke="rgb(0,0,0)" stroke-width="1"></polygon>
							<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="13" font-style="normal" font-weight="normal" height="40" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="80" x="90" y="50">Name</textArea>
						</svg>
					</icon>
				</object>
				<object id="Object_Goal_user_3670396974" type="Object_Goal_user_3670396974" typeName="Goal">
					<description></description>
					<slot id="a6wtib" name="Name" unique="false">
						<property href="#Property_Name_user_3669789122"></property>
					</slot>
					<slot id="a7bpm7" name="Opportunity" unique="false">
						<property href="#Property_Opportunity_Eva_3676441423"></property>
					</slot>
					<slot id="a8bpmp" name="Threat" unique="false">
						<property href="#Property_Threat_Eva_3676441474"></property>
					</slot>
					<identProp slotID="a6wtib"></identProp>
					<objectSymbol offset="40,60" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
						<defaultConnectable isSticky="true" points="40,70 50,60 130,60 140,70 140,90 130,100 50,100 40,90 40,70" targetPointX="90" targetPointY="80" usesGrid="false"></defaultConnectable>
						<svg baseProfile="tiny" height="100" version="1.2" width="140" xmlns="http://www.w3.org/2000/svg">
							<rect fill="none" height="40" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-width="1" width="100" x="40" y="60">
								<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
							</rect>
							<rect fill="rgb(192,255,128)" height="40" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-width="1" width="100" x="40" y="60">
								<metaInfo xmlns="http://www.metacase.com/symbol">
									<displayCondition conditionOperator="=" matchString="T" xmlns="http://www.w3.org/2000/svg">PropertyTextSource:a7bpm7</displayCondition>
								</metaInfo>
							</rect>
							<rect fill="rgb(255,192,192)" height="40" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-width="1" width="100" x="40" y="60">
								<metaInfo xmlns="http://www.metacase.com/symbol">
									<displayCondition conditionOperator="=" matchString="T" xmlns="http://www.w3.org/2000/svg">PropertyTextSource:a8bpmp</displayCondition>
								</metaInfo>
							</rect>
							<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="40" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="100" x="40" y="60">
								PropertyTextSource:a6wtib
								<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
							</textArea>
						</svg>
					</objectSymbol>
					<icon offset="40,60" xmlns="http://www.metacase.com/icon">
						<svg baseProfile="tiny" height="100" version="1.2" width="140" xmlns="http://www.w3.org/2000/svg">
							<rect fill="none" height="40" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-width="1" width="100" x="40" y="60"></rect>
							<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="11" font-style="normal" font-weight="normal" height="40" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="100" x="40" y="60">Goal</textArea>
						</svg>
					</icon>
				</object>
				<object id="Object_Quality_Eva_3678163547" type="Object_Quality_Eva_3678163547" typeName="Quality">
					<description></description>
					<slot id="a0rmbm" name="Name" unique="false">
						<property href="#Property_Name_user_3669789122"></property>
					</slot>
					<slot id="a2br11" name="Opportunity" unique="false">
						<property href="#Property_Opportunity_Eva_3676441423"></property>
					</slot>
					<slot id="a3j2lu" name="Threat" unique="false">
						<property href="#Property_Threat_Eva_3676441474"></property>
					</slot>
					<identProp slotID="a0rmbm"></identProp>
					<objectSymbol offset="60,60" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
						<defaultConnectable isSticky="true" points="68.3333,60 93.3333,60 110,68.3333 118.333,68.3333 126.667,60 151.667,60 160,60 160,68.3333 151.667,101.667 143.333,110 126.667,110 110,101.667 101.667,101.667 85,110 68.3333,110 60,101.667 68.3333,68.3333 68.3333,60" targetPointX="110" targetPointY="85" usesGrid="false"></defaultConnectable>
						<svg baseProfile="tiny" height="109.997" version="1.2" width="160.006" xmlns="http://www.w3.org/2000/svg">
							<path d="M60.1208,99.2967 L60.454,96.8623 L60.958,94.1349 L61.6003,91.189 L62.3486,88.0989 L63.1703,84.9392 L64.0328,81.7842 L64.9038,78.7083 L65.7508,75.786 L66.5412,73.0917 L67.2426,70.6998 L68.0613,67.9008 L68.7499,65.762 L69.4261,64.1749 L70.2079,63.0306 L71.213,62.2204 L72.5592,61.6356 L74.3645,61.1675 L77.1429,60.666 L80.5042,60.2567 L84.2458,60.0208 L88.1656,60.0398 L92.0612,60.3949 L95.7302,61.1675 L99.6157,62.6929 L102.933,64.6727 L105.732,66.8431 L108.063,68.9401 L109.973,70.6998 L111.881,72.1091 L113.507,72.579 L115.147,72.1093 L117.096,70.6998 L119.057,68.9397 L121.433,66.8422 L124.253,64.6715 L127.546,62.6919 L131.339,61.1675 L135.612,60.2948 L140.15,60 L144.687,60.1415 L148.96,60.5778 L152.705,61.1675 L154.926,61.6311 L156.743,62.2107 L158.159,63.0163 L159.174,64.1581 L159.789,65.7459 L160.006,67.8898 L159.827,70.6998 L159.471,73.1032 L158.952,75.8107 L158.302,78.7465 L157.552,81.8343 L156.734,84.9982 L155.878,88.1622 L155.016,91.2501 L154.179,94.1858 L153.398,96.8934 L152.705,99.2967 L151.894,102.107 L151.209,104.251 L150.534,105.839 L149.75,106.98 L148.741,107.786 L147.391,108.366 L145.582,108.829 L142.802,109.328 L139.44,109.736 L135.698,109.972 L131.78,109.954 L127.885,109.601 L124.218,108.829 L120.333,107.305 L117.016,105.325 L114.216,103.155 L111.885,101.057 L109.973,99.2967 L108.065,97.8871 L106.438,97.4172 L104.799,97.8871 L102.852,99.2967 L100.894,101.057 L98.5206,103.155 L95.7016,105.325 L92.4075,107.305 L88.6086,108.829 L84.325,109.702 L79.7769,109.997 L75.2338,109.855 L70.9658,109.419 L67.2426,108.829 L65.0484,108.366 L63.2611,107.787 L61.8719,106.981 L60.872,105.84 L60.2527,104.252 L60.0052,102.107 Z" fill="none" stroke="rgb(0,0,0)" stroke-width="1" sym:controlPoints="60.1208,99.2967 67.2426,70.6998 74.3645,61.1675 95.7302,61.1675 109.973,70.6998 117.096,70.6998 131.339,61.1675 152.705,61.1675 159.827,70.6998 152.705,99.2967 145.582,108.829 124.218,108.829 109.973,99.2967 102.852,99.2967 88.6086,108.829 67.2426,108.829">
								<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
							</path>
							<path d="M60.1155,99.2967 L60.4487,96.8623 L60.9527,94.1349 L61.5951,91.189 L62.3434,88.0989 L63.165,84.9392 L64.0276,81.7842 L64.8986,78.7083 L65.7455,75.786 L66.536,73.0917 L67.2374,70.6998 L68.0561,67.9008 L68.7446,65.762 L69.4209,64.1749 L70.2026,63.0306 L71.2077,62.2204 L72.554,61.6356 L74.3592,61.1675 L74.3592,61.1675 L77.1377,60.666 L80.4989,60.2567 L84.2406,60.0208 L88.1604,60.0398 L92.0559,60.3949 L95.725,61.1675 L99.6104,62.6929 L102.928,64.6727 L105.727,66.8431 L108.057,68.9401 L109.968,70.6998 L111.876,72.1091 L113.502,72.579 L115.141,72.1093 L117.091,70.6998 L119.051,68.9397 L121.428,66.8422 L124.248,64.6715 L127.541,62.6919 L131.334,61.1675 L135.607,60.2948 L140.145,60 L144.682,60.1415 L148.955,60.5778 L152.7,61.1675 L152.7,61.1675 L154.921,61.6311 L156.738,62.2107 L158.154,63.0163 L159.168,64.1581 L159.784,65.7459 L160.001,67.8898 L159.821,70.6998 L159.465,73.1032 L158.947,75.8107 L158.297,78.7465 L157.547,81.8343 L156.729,84.9983 L155.873,88.1622 L155.01,91.2501 L154.173,94.1858 L153.393,96.8934 L152.7,99.2967 L151.889,102.107 L151.204,104.251 L150.528,105.839 L149.744,106.98 L148.736,107.786 L147.386,108.366 L145.577,108.829 L142.796,109.328 L139.434,109.736 L135.693,109.972 L131.774,109.954 L127.88,109.601 L124.212,108.829 L120.328,107.305 L117.01,105.325 L114.211,103.155 L111.88,101.057 L109.968,99.2967 L108.059,97.8871 L106.433,97.4172 L104.794,97.8871 L102.847,99.2967 L100.889,101.057 L98.5153,103.155 L95.6964,105.325 L92.4022,107.305 L88.6033,108.829 L84.3198,109.702 L79.7716,109.997 L75.2286,109.855 L70.9606,109.419 L67.2374,108.829 L65.0432,108.366 L63.2559,107.787 L61.8667,106.981 L60.8668,105.84 L60.2475,104.252 L60,102.107 Z" fill="rgb(192,255,128)" stroke="rgb(0,0,0)" stroke-width="1" sym:controlPoints="60.1155,99.2967 67.2374,70.6998 74.3592,61.1675 95.725,61.1675 109.968,70.6998 117.091,70.6998 131.334,61.1675 152.7,61.1675 159.821,70.6998 152.7,99.2967 145.577,108.829 124.212,108.829 109.968,99.2967 102.847,99.2967 88.6033,108.829 67.2374,108.829">
								<metaInfo xmlns="http://www.metacase.com/symbol">
									<displayCondition conditionOperator="=" matchString="T" xmlns="http://www.w3.org/2000/svg">PropertyTextSource:a2br11</displayCondition>
								</metaInfo>
							</path>
							<path d="M60.1155,99.2967 L60.4487,96.8623 L60.9527,94.1349 L61.5951,91.189 L62.3434,88.0989 L63.165,84.9392 L64.0276,81.7842 L64.8986,78.7083 L65.7455,75.786 L66.536,73.0917 L67.2374,70.6998 L68.0561,67.9008 L68.7446,65.762 L69.4209,64.1749 L70.2026,63.0306 L71.2077,62.2204 L72.554,61.6356 L74.3592,61.1675 L77.1377,60.666 L80.4989,60.2567 L84.2406,60.0208 L88.1604,60.0398 L92.0559,60.3949 L95.725,61.1675 L99.6104,62.6929 L102.928,64.6727 L105.727,66.8431 L108.057,68.9401 L109.968,70.6998 L111.876,72.1091 L113.502,72.579 L115.141,72.1093 L117.091,70.6998 L119.051,68.9397 L121.428,66.8422 L124.248,64.6715 L127.541,62.6919 L131.334,61.1675 L135.607,60.2948 L140.145,60 L144.682,60.1415 L148.955,60.5778 L152.7,61.1675 L154.921,61.6311 L156.738,62.2107 L158.154,63.0163 L159.168,64.1581 L159.784,65.7459 L160.001,67.8898 L159.821,70.6998 L159.465,73.1032 L158.947,75.8107 L158.297,78.7465 L157.547,81.8343 L156.729,84.9982 L155.873,88.1622 L155.01,91.2501 L154.173,94.1858 L153.393,96.8934 L152.7,99.2967 L151.889,102.107 L151.204,104.251 L150.528,105.839 L149.744,106.98 L148.736,107.786 L147.386,108.366 L145.577,108.829 L142.796,109.328 L139.434,109.736 L135.693,109.972 L131.774,109.954 L127.88,109.601 L124.212,108.829 L120.328,107.305 L117.01,105.325 L114.211,103.155 L111.88,101.057 L109.968,99.2967 L108.059,97.8871 L106.433,97.4172 L104.794,97.8871 L102.847,99.2967 L100.889,101.057 L98.5153,103.155 L95.6964,105.325 L92.4022,107.305 L88.6033,108.829 L84.3198,109.702 L79.7716,109.997 L75.2286,109.855 L70.9606,109.419 L67.2374,108.829 L65.0432,108.366 L63.2559,107.787 L61.8667,106.981 L60.8668,105.84 L60.2475,104.252 L60,102.107 Z" fill="rgb(255,192,192)" stroke="rgb(0,0,0)" stroke-width="1" sym:controlPoints="60.1155,99.2967 67.2374,70.6998 74.3592,61.1675 95.725,61.1675 109.968,70.6998 117.091,70.6998 131.334,61.1675 152.7,61.1675 159.821,70.6998 152.7,99.2967 145.577,108.829 124.212,108.829 109.968,99.2967 102.847,99.2967 88.6033,108.829 67.2374,108.829">
								<metaInfo xmlns="http://www.metacase.com/symbol">
									<displayCondition conditionOperator="=" matchString="T" xmlns="http://www.w3.org/2000/svg">PropertyTextSource:a1br0x</displayCondition>
								</metaInfo>
							</path>
							<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="30" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="80" x="70" y="70">
								PropertyTextSource:a0rmbm
								<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
							</textArea>
						</svg>
					</objectSymbol>
					<icon offset="60.0052,60" xmlns="http://www.metacase.com/icon">
						<svg baseProfile="tiny" height="109.997" version="1.2" width="160.006" xmlns="http://www.w3.org/2000/svg">
							<path d="M60.1208,99.2967 L60.454,96.8623 L60.958,94.1349 L61.6003,91.189 L62.3486,88.0989 L63.1703,84.9392 L64.0328,81.7842 L64.9038,78.7083 L65.7508,75.786 L66.5412,73.0917 L67.2426,70.6998 L68.0613,67.9008 L68.7499,65.762 L69.4261,64.1749 L70.2079,63.0306 L71.213,62.2204 L72.5592,61.6356 L74.3645,61.1675 L77.1429,60.666 L80.5042,60.2567 L84.2458,60.0208 L88.1656,60.0398 L92.0612,60.3949 L95.7302,61.1675 L99.6157,62.6929 L102.933,64.6727 L105.732,66.8431 L108.063,68.9401 L109.973,70.6998 L111.881,72.1091 L113.507,72.579 L115.147,72.1093 L117.096,70.6998 L119.057,68.9397 L121.433,66.8422 L124.253,64.6715 L127.546,62.6919 L131.339,61.1675 L135.612,60.2948 L140.15,60 L144.687,60.1415 L148.96,60.5778 L152.705,61.1675 L154.926,61.6311 L156.743,62.2107 L158.159,63.0163 L159.174,64.1581 L159.789,65.7459 L160.006,67.8898 L159.827,70.6998 L159.471,73.1032 L158.952,75.8107 L158.302,78.7465 L157.552,81.8343 L156.734,84.9982 L155.878,88.1622 L155.016,91.2501 L154.179,94.1858 L153.398,96.8934 L152.705,99.2967 L151.894,102.107 L151.209,104.251 L150.534,105.839 L149.75,106.98 L148.741,107.786 L147.391,108.366 L145.582,108.829 L142.802,109.328 L139.44,109.736 L135.698,109.972 L131.78,109.954 L127.885,109.601 L124.218,108.829 L120.333,107.305 L117.016,105.325 L114.216,103.155 L111.885,101.057 L109.973,99.2967 L108.065,97.8871 L106.438,97.4172 L104.799,97.8871 L102.852,99.2967 L100.894,101.057 L98.5206,103.155 L95.7016,105.325 L92.4075,107.305 L88.6086,108.829 L84.325,109.702 L79.7769,109.997 L75.2338,109.855 L70.9658,109.419 L67.2426,108.829 L65.0484,108.366 L63.2611,107.787 L61.8719,106.981 L60.872,105.84 L60.2527,104.252 L60.0052,102.107 Z" fill="none" stroke="rgb(0,0,0)" stroke-width="1" sym:controlPoints="60.1208,99.2967 67.2426,70.6998 74.3645,61.1675 95.7302,61.1675 109.973,70.6998 117.096,70.6998 131.339,61.1675 152.705,61.1675 159.827,70.6998 152.705,99.2967 145.582,108.829 124.218,108.829 109.973,99.2967 102.852,99.2967 88.6086,108.829 67.2426,108.829"></path>
							<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="13" font-style="normal" font-weight="normal" height="30" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="80" x="70" y="70">Quality</textArea>
						</svg>
					</icon>
				</object>
				<object id="Object_Ressource_Eva_3678163788" type="Object_Ressource_Eva_3678163788" typeName="Ressource">
					<description></description>
					<slot id="a7rmom" name="Name" unique="false">
						<property href="#Property_Name_user_3669789122"></property>
					</slot>
					<slot id="a9brpu" name="Opportunity" unique="false">
						<property href="#Property_Opportunity_Eva_3676441423"></property>
					</slot>
					<slot id="a8brpp" name="Threat" unique="false">
						<property href="#Property_Threat_Eva_3676441474"></property>
					</slot>
					<identProp slotID="a7rmom"></identProp>
					<objectSymbol offset="50,50" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
						<defaultConnectable isSticky="true" points="50,50 150,50 150,100 50,100 50,50" targetPointX="100" targetPointY="75" usesGrid="false"></defaultConnectable>
						<svg baseProfile="tiny" height="100" version="1.2" width="150" xmlns="http://www.w3.org/2000/svg">
							<rect fill="none" height="50" rx="0" ry="0" stroke="rgb(0,0,0)" stroke-width="1" width="100" x="50" y="50">
								<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
							</rect>
							<rect fill="rgb(192,255,128)" height="50" rx="0" ry="0" stroke="rgb(0,0,0)" stroke-width="1" width="100" x="50" y="50">
								<metaInfo xmlns="http://www.metacase.com/symbol">
									<displayCondition conditionOperator="=" matchString="T" xmlns="http://www.w3.org/2000/svg">PropertyTextSource:a9brpu</displayCondition>
								</metaInfo>
							</rect>
							<rect fill="rgb(255,192,192)" height="50" rx="0" ry="0" stroke="rgb(0,0,0)" stroke-width="1" width="100" x="50" y="50">
								<metaInfo xmlns="http://www.metacase.com/symbol">
									<displayCondition conditionOperator="=" matchString="T" xmlns="http://www.w3.org/2000/svg">PropertyTextSource:a8brpp</displayCondition>
								</metaInfo>
							</rect>
							<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="50" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="100" x="50" y="50">
								PropertyTextSource:a7rmom
								<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
							</textArea>
						</svg>
					</objectSymbol>
					<icon offset="50,50" xmlns="http://www.metacase.com/icon">
						<svg baseProfile="tiny" height="100" version="1.2" width="150" xmlns="http://www.w3.org/2000/svg">
							<rect fill="none" height="50" rx="0" ry="0" stroke="rgb(0,0,0)" stroke-width="1" width="100" x="50" y="50"></rect>
							<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="13" font-style="normal" font-weight="normal" height="50" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="100" x="50" y="50">Ressource</textArea>
						</svg>
					</icon>
				</object>
				<relationship id="Relationship_Help_user_3670398954" type="Relationship_Help_user_3670398954" typeName="helps">
					<description></description>
					<relationshipSymbol offset="50,80" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
						<defaultConnectable isSticky="true" points="50,80 90,80 90,100 50,100 50,80" targetPointX="70" targetPointY="90" usesGrid="false"></defaultConnectable>
						<svg baseProfile="tiny" height="100" version="1.2" width="90" xmlns="http://www.w3.org/2000/svg">
							<textArea display-align="before" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="20" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="40" x="50" y="80">
								helps
								<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
							</textArea>
						</svg>
					</relationshipSymbol>
				</relationship>
				<relationship id="Relationship_Hurt_user_3670398840" type="Relationship_Hurt_user_3670398840" typeName="hurts">
					<description></description>
					<relationshipSymbol offset="50,80" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
						<defaultConnectable isSticky="true" points="50,80 90,80 90,100 50,100 50,80" targetPointX="70" targetPointY="90" usesGrid="false"></defaultConnectable>
						<svg baseProfile="tiny" height="100" version="1.2" width="90" xmlns="http://www.w3.org/2000/svg">
							<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="20" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="40" x="50" y="80">
								hurts
								<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
							</textArea>
						</svg>
					</relationshipSymbol>
				</relationship>
				<relationship id="Relationship_Qualifies_Eva_3678165309" type="Relationship_Qualifies_Eva_3678165309" typeName="qualifies">
					<description></description>
				</relationship>
				<relationship id="Relationship_Refines_Eva_3678165787" type="Relationship_Refines_Eva_3678165787" typeName="refines">
					<description></description>
				</relationship>
				<role id="Role_Helpee_user_3670399368" type="Role_Helpee_user_3670399368" typeName="Helpee">
					<description></description>
					<roleSymbol xmlns="http://www.metacase.com/symbol">
						<rolelineGOs stroke="rgb(0,0,0)" stroke-width="1">
							<metaInfo shouldRotate="false"></metaInfo>
						</rolelineGOs>
						<svg baseProfile="tiny" height="90" version="1.2" width="150" xmlns="http://www.w3.org/2000/svg">
							<polyline fill="none" points="140,70 150,80 140,90" stroke="rgb(0,0,0)" stroke-width="1">
								<metaInfo shouldRotate="true" xmlns="http://www.metacase.com/symbol"></metaInfo>
							</polyline>
						</svg>
					</roleSymbol>
				</role>
				<role id="Role_Helper_user_3670399360" type="Role_Helper_user_3670399360" typeName="Helper">
					<description></description>
					<roleSymbol xmlns="http://www.metacase.com/symbol">
						<rolelineGOs stroke="rgb(0,0,0)" stroke-width="1">
							<metaInfo shouldRotate="false"></metaInfo>
						</rolelineGOs>
						<svg baseProfile="tiny" height="0" version="1.2" width="0" xmlns="http://www.w3.org/2000/svg"></svg>
					</roleSymbol>
				</role>
				<role id="Role_Injuree_user_3670399299" type="Role_Injuree_user_3670399299" typeName="Injuree">
					<description></description>
					<roleSymbol xmlns="http://www.metacase.com/symbol">
						<rolelineGOs stroke="rgb(0,0,0)" stroke-width="1">
							<metaInfo shouldRotate="false"></metaInfo>
						</rolelineGOs>
						<svg baseProfile="tiny" height="90" version="1.2" width="150" xmlns="http://www.w3.org/2000/svg">
							<polyline fill="none" points="140,70 150,80 140,90" stroke="rgb(0,0,0)" stroke-width="1">
								<metaInfo shouldRotate="true" xmlns="http://www.metacase.com/symbol"></metaInfo>
							</polyline>
						</svg>
					</roleSymbol>
				</role>
				<role id="Role_Injurer_user_3670399271" type="Role_Injurer_user_3670399271" typeName="Injurer">
					<description></description>
				</role>
				<role id="Role_Qualifiee_Eva_3678165410" type="Role_Qualifiee_Eva_3678165410" typeName="Qualifiee">
					<description></description>
					<roleSymbol xmlns="http://www.metacase.com/symbol">
						<rolelineGOs stroke="rgb(0,0,0)" stroke-dasharray="4,2" stroke-width="1">
							<metaInfo shouldRotate="false"></metaInfo>
						</rolelineGOs>
						<svg baseProfile="tiny" height="0" version="1.2" width="0" xmlns="http://www.w3.org/2000/svg"></svg>
					</roleSymbol>
				</role>
				<role id="Role_Qualifier_Eva_3678165339" type="Role_Qualifier_Eva_3678165339" typeName="Qualifier">
					<description></description>
					<roleSymbol xmlns="http://www.metacase.com/symbol">
						<rolelineGOs stroke="rgb(0,0,0)" stroke-dasharray="4,2" stroke-width="1">
							<metaInfo shouldRotate="false"></metaInfo>
						</rolelineGOs>
						<svg baseProfile="tiny" height="0" version="1.2" width="0" xmlns="http://www.w3.org/2000/svg"></svg>
					</roleSymbol>
				</role>
				<role id="Role_Refinee_Eva_3678165809" type="Role_Refinee_Eva_3678165809" typeName="Refinee">
					<description></description>
					<roleSymbol xmlns="http://www.metacase.com/symbol">
						<rolelineGOs stroke="rgb(0,0,0)" stroke-width="1">
							<metaInfo shouldRotate="false"></metaInfo>
						</rolelineGOs>
						<svg baseProfile="tiny" height="85" version="1.2" width="150" xmlns="http://www.w3.org/2000/svg">
							<polygon fill="rgb(0,0,0)" points="140,75 150,80 140,85" stroke="rgb(0,0,0)" stroke-width="1">
								<metaInfo shouldRotate="true" xmlns="http://www.metacase.com/symbol"></metaInfo>
							</polygon>
						</svg>
					</roleSymbol>
				</role>
				<role id="Role_Refiner_Eva_3678165803" type="Role_Refiner_Eva_3678165803" typeName="Refiner">
					<description></description>
				</role>
				<binding>
					<relationship href="#Relationship_Help_user_3670398954"></relationship>
					<connection>
						<cardinality start="1" stop="1"></cardinality>
						<role href="#Role_Helper_user_3670399360"></role>
						<object href="#Object_Goal_user_3670396974"></object>
						<object href="#Object_Quality_Eva_3678163547"></object>
						<object href="#Object_Ressource_Eva_3678163788"></object>
						<object href="#Object_Task_user_3670397845"></object>
					</connection>
					<connection>
						<cardinality start="1" stop="1"></cardinality>
						<role href="#Role_Helpee_user_3670399368"></role>
						<object href="#Object_Quality_Eva_3678163547"></object>
					</connection>
				</binding>
				<binding>
					<relationship href="#Relationship_Hurt_user_3670398840"></relationship>
					<connection>
						<cardinality start="1" stop="1"></cardinality>
						<role href="#Role_Injurer_user_3670399271"></role>
						<object href="#Object_Goal_user_3670396974"></object>
						<object href="#Object_Quality_Eva_3678163547"></object>
						<object href="#Object_Ressource_Eva_3678163788"></object>
						<object href="#Object_Task_user_3670397845"></object>
					</connection>
					<connection>
						<cardinality start="1" stop="1"></cardinality>
						<role href="#Role_Injuree_user_3670399299"></role>
						<object href="#Object_Quality_Eva_3678163547"></object>
					</connection>
				</binding>
				<binding>
					<relationship href="#Relationship_Qualifies_Eva_3678165309"></relationship>
					<connection>
						<cardinality start="1" stop="1"></cardinality>
						<role href="#Role_Qualifier_Eva_3678165339"></role>
						<object href="#Object_Quality_Eva_3678163547"></object>
					</connection>
					<connection>
						<cardinality start="1" stop="1"></cardinality>
						<role href="#Role_Qualifiee_Eva_3678165410"></role>
						<object href="#Object_Goal_user_3670396974"></object>
						<object href="#Object_Ressource_Eva_3678163788"></object>
						<object href="#Object_Task_user_3670397845"></object>
					</connection>
				</binding>
				<binding>
					<relationship href="#Relationship_Refines_Eva_3678165787"></relationship>
					<connection>
						<cardinality start="1" stop="1"></cardinality>
						<role href="#Role_Refiner_Eva_3678165803"></role>
						<object href="#Object_Goal_user_3670396974"></object>
						<object href="#Object_Task_user_3670397845"></object>
					</connection>
					<connection>
						<cardinality start="1" stop="1"></cardinality>
						<role href="#Role_Refinee_Eva_3678165809"></role>
						<object href="#Object_Goal_user_3670396974"></object>
						<object href="#Object_Task_user_3670397845"></object>
					</connection>
				</binding>
			</graph>
		</superType>
		<object href="#Object_Task_user_3670397845"></object>
		<object href="#Object_Goal_user_3670396974"></object>
		<object href="#Object_Quality_Eva_3678163547"></object>
		<object href="#Object_Ressource_Eva_3678163788"></object>
		<relationship href="#Relationship_Help_user_3670398954"></relationship>
		<relationship href="#Relationship_Hurt_user_3670398840"></relationship>
		<relationship href="#Relationship_Qualifies_Eva_3678165309"></relationship>
		<relationship href="#Relationship_Refines_Eva_3678165787"></relationship>
		<role href="#Role_Helpee_user_3670399368"></role>
		<role href="#Role_Helper_user_3670399360"></role>
		<role href="#Role_Injuree_user_3670399299"></role>
		<role href="#Role_Injurer_user_3670399271"></role>
		<role href="#Role_Qualifiee_Eva_3678165410"></role>
		<role href="#Role_Qualifier_Eva_3678165339"></role>
		<role href="#Role_Refinee_Eva_3678165809"></role>
		<role href="#Role_Refiner_Eva_3678165803"></role>
		<binding>
			<relationship href="#Relationship_Help_user_3670398954"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Helper_user_3670399360"></role>
				<object href="#Object_Goal_user_3670396974"></object>
				<object href="#Object_Quality_Eva_3678163547"></object>
				<object href="#Object_Ressource_Eva_3678163788"></object>
				<object href="#Object_Task_user_3670397845"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Helpee_user_3670399368"></role>
				<object href="#Object_Quality_Eva_3678163547"></object>
			</connection>
		</binding>
		<binding>
			<relationship href="#Relationship_Hurt_user_3670398840"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Injurer_user_3670399271"></role>
				<object href="#Object_Goal_user_3670396974"></object>
				<object href="#Object_Quality_Eva_3678163547"></object>
				<object href="#Object_Ressource_Eva_3678163788"></object>
				<object href="#Object_Task_user_3670397845"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Injuree_user_3670399299"></role>
				<object href="#Object_Quality_Eva_3678163547"></object>
			</connection>
		</binding>
		<binding>
			<relationship href="#Relationship_Qualifies_Eva_3678165309"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Qualifier_Eva_3678165339"></role>
				<object href="#Object_Quality_Eva_3678163547"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Qualifiee_Eva_3678165410"></role>
				<object href="#Object_Goal_user_3670396974"></object>
				<object href="#Object_Ressource_Eva_3678163788"></object>
				<object href="#Object_Task_user_3670397845"></object>
			</connection>
		</binding>
		<binding>
			<relationship href="#Relationship_Refines_Eva_3678165787"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Refiner_Eva_3678165803"></role>
				<object href="#Object_Goal_user_3670396974"></object>
				<object href="#Object_Task_user_3670397845"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Refinee_Eva_3678165809"></role>
				<object href="#Object_Goal_user_3670396974"></object>
				<object href="#Object_Task_user_3670397845"></object>
			</connection>
		</binding>
	</graph>
	<graph href="#Graph_Boundary_Eva_3674411585"></graph>
	<graph id="Graph_FactorBoundary_Eva_3683465953" type="Graph_FactorBoundary_Eva_3683465953" typeName="FactorBoundary">
		<description></description>
		<superType>
			<graph href="#Graph_Boundary_Eva_3674411585"></graph>
		</superType>
		<object href="#Object_Task_user_3670397845"></object>
		<object href="#Object_Goal_user_3670396974"></object>
		<object href="#Object_Quality_Eva_3678163547"></object>
		<object href="#Object_Ressource_Eva_3678163788"></object>
		<relationship href="#Relationship_Help_user_3670398954"></relationship>
		<relationship href="#Relationship_Hurt_user_3670398840"></relationship>
		<relationship href="#Relationship_Qualifies_Eva_3678165309"></relationship>
		<relationship href="#Relationship_Refines_Eva_3678165787"></relationship>
		<role href="#Role_Helpee_user_3670399368"></role>
		<role href="#Role_Helper_user_3670399360"></role>
		<role href="#Role_Injuree_user_3670399299"></role>
		<role href="#Role_Injurer_user_3670399271"></role>
		<role href="#Role_Qualifiee_Eva_3678165410"></role>
		<role href="#Role_Qualifier_Eva_3678165339"></role>
		<role href="#Role_Refinee_Eva_3678165809"></role>
		<role href="#Role_Refiner_Eva_3678165803"></role>
		<binding>
			<relationship href="#Relationship_Help_user_3670398954"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Helper_user_3670399360"></role>
				<object href="#Object_Goal_user_3670396974"></object>
				<object href="#Object_Quality_Eva_3678163547"></object>
				<object href="#Object_Ressource_Eva_3678163788"></object>
				<object href="#Object_Task_user_3670397845"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Helpee_user_3670399368"></role>
				<object href="#Object_Quality_Eva_3678163547"></object>
			</connection>
		</binding>
		<binding>
			<relationship href="#Relationship_Hurt_user_3670398840"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Injurer_user_3670399271"></role>
				<object href="#Object_Goal_user_3670396974"></object>
				<object href="#Object_Quality_Eva_3678163547"></object>
				<object href="#Object_Ressource_Eva_3678163788"></object>
				<object href="#Object_Task_user_3670397845"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Injuree_user_3670399299"></role>
				<object href="#Object_Quality_Eva_3678163547"></object>
			</connection>
		</binding>
		<binding>
			<relationship href="#Relationship_Qualifies_Eva_3678165309"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Qualifier_Eva_3678165339"></role>
				<object href="#Object_Quality_Eva_3678163547"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Qualifiee_Eva_3678165410"></role>
				<object href="#Object_Goal_user_3670396974"></object>
				<object href="#Object_Ressource_Eva_3678163788"></object>
				<object href="#Object_Task_user_3670397845"></object>
			</connection>
		</binding>
		<binding>
			<relationship href="#Relationship_Refines_Eva_3678165787"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Refiner_Eva_3678165803"></role>
				<object href="#Object_Goal_user_3670396974"></object>
				<object href="#Object_Task_user_3670397845"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Refinee_Eva_3678165809"></role>
				<object href="#Object_Goal_user_3670396974"></object>
				<object href="#Object_Task_user_3670397845"></object>
			</connection>
		</binding>
	</graph>
	<graph type="Graph_PESTEL_i_star_user_3670399548" typeName="PESTEL i-star">
		<description></description>
		<slot id="a0it8k" name="Autor" unique="false">
			<property type="Property_Autor_user_3670399810" typeName="Autor">
				<description></description>
				<dataType>
					<simpleType>String</simpleType>
				</dataType>
				<defaultValue>
					<string></string>
				</defaultValue>
				<widget>Input Field</widget>
			</property>
		</slot>
		<slot id="a2nmia" name="Default Prefix" unique="false">
			<property type="Property_Default_Prefix_Eva_3680589785" typeName="Default Prefix">
				<description></description>
				<dataType>
					<simpleType>String</simpleType>
				</dataType>
				<defaultValue>
					<string></string>
				</defaultValue>
				<widget>Input Field</widget>
			</property>
		</slot>
		<slot id="a1it9g" name="Company" unique="false">
			<property type="Property_Company_user_3670399826" typeName="Company">
				<description></description>
				<dataType>
					<simpleType>String</simpleType>
				</dataType>
				<defaultValue>
					<string></string>
				</defaultValue>
				<widget>Input Field</widget>
			</property>
		</slot>
		<identProp slotID="a1it9g"></identProp>
		<object id="Object_Politics_user_3670396476" type="Object_Politics_user_3670396476" typeName="Political">
			<description></description>
			<superType>
				<object id="Object_PESTELFactor_user_3670396439" type="Object_PESTELFactor_user_3670396439" typeName="PESTELFactor">
					<description></description>
				</object>
			</superType>
			<objectSymbol offset="32,41" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="50,40 60,40 70,40 80,50 80,60 80,70 80,80 70,90 40,90 30,80 30,50 40,40 50,40" targetPointX="55" targetPointY="65" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="336" version="1.2" width="278" xmlns="http://www.w3.org/2000/svg">
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,73" startDistance="0">
							<layoutPath allocation="start" layoutDistance="53" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Quality_Eva_3678163547" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="205,73" startDistance="0">
							<layoutPath allocation="start" layoutDistance="50" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Goal_user_3670396974" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<rect fill="none" height="255" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-dasharray="4,2" stroke-width="1" width="228" x="50" y="81">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</rect>
					<ellipse cx="56" cy="65.5" fill="rgb(255,255,255)" rx="24" ry="24.5" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="3.6e2" sym:sweepAngle="-3.6e2">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</ellipse>
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="49" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="48" x="32" y="41">
						Political
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,246" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Task_user_3670397845" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,299" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Ressource_Eva_3678163788" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
				</svg>
			</objectSymbol>
			<icon offset="30,40" xmlns="http://www.metacase.com/icon">
				<svg baseProfile="tiny" height="60" version="1.2" width="40" xmlns="http://www.w3.org/2000/svg">
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="14" font-style="normal" font-weight="bold" height="20" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="10" x="30" y="40">P</textArea>
				</svg>
			</icon>
		</object>
		<object id="Object_Ecology_user_3670396717" type="Object_Ecology_user_3670396717" typeName="Economic">
			<description></description>
			<superType>
				<object href="#Object_PESTELFactor_user_3670396439"></object>
			</superType>
			<objectSymbol offset="32,31" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="50,30 60,30 70,30 80,40 80,50 80,60 80,70 70,80 50,80 40,80 30,70 30,40 40,30 50,30" targetPointX="55" targetPointY="55" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="326" version="1.2" width="278" xmlns="http://www.w3.org/2000/svg">
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,63" startDistance="0">
							<layoutPath allocation="start" layoutDistance="53" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Quality_Eva_3678163547" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="205,63" startDistance="0">
							<layoutPath allocation="start" layoutDistance="50" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Goal_user_3670396974" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<rect fill="none" height="255" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-dasharray="4,2" stroke-width="1" width="228" x="50" y="71">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</rect>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,236" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Task_user_3670397845" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,289" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Ressource_Eva_3678163788" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<ellipse cx="56" cy="55.5" fill="rgb(255,255,255)" rx="24" ry="24.5" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="3.6e2" sym:sweepAngle="-3.6e2">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</ellipse>
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="49" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="48" x="32" y="31">
						Econo-
mic
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
				</svg>
			</objectSymbol>
			<icon offset="40,30" xmlns="http://www.metacase.com/icon">
				<svg baseProfile="tiny" height="50" version="1.2" width="50" xmlns="http://www.w3.org/2000/svg">
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="14" font-style="normal" font-weight="bold" height="20" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="10" x="40" y="30">E</textArea>
				</svg>
			</icon>
		</object>
		<object id="Object_Social_user_3671098460" type="Object_Social_user_3671098460" typeName="Social">
			<description></description>
			<superType>
				<object href="#Object_PESTELFactor_user_3670396439"></object>
			</superType>
			<objectSymbol offset="30,41" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="38,41 68,41 78,50 78,80 68,90 38,90 30,80 30,50 38,41" targetPointX="54" targetPointY="66" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="336" version="1.2" width="278" xmlns="http://www.w3.org/2000/svg">
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,73" startDistance="0">
							<layoutPath allocation="start" layoutDistance="53" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Quality_Eva_3678163547" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="205,73" startDistance="0">
							<layoutPath allocation="start" layoutDistance="50" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Goal_user_3670396974" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<rect fill="none" height="255" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-dasharray="4,2" stroke-width="1" width="228" x="50" y="81">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</rect>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,246" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Task_user_3670397845" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,299" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Ressource_Eva_3678163788" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<ellipse cx="54" cy="65.5" fill="rgb(255,255,255)" rx="24" ry="24.5" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="3.6e2" sym:sweepAngle="-3.6e2">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</ellipse>
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="49" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="48" x="30" y="41">
						Social
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
				</svg>
			</objectSymbol>
			<icon offset="30,50" xmlns="http://www.metacase.com/icon">
				<svg baseProfile="tiny" height="70" version="1.2" width="40" xmlns="http://www.w3.org/2000/svg">
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="14" font-style="normal" font-weight="bold" height="20" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="10" x="30" y="50">S</textArea>
				</svg>
			</icon>
		</object>
		<object id="Object_Technological_user_3671098683" type="Object_Technological_user_3671098683" typeName="Technological">
			<description></description>
			<superType>
				<object href="#Object_PESTELFactor_user_3670396439"></object>
			</superType>
			<objectSymbol offset="30,41" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="38,41 68,41 78,50 78,80 68,90 39,90 30,80 30,50 38,41" targetPointX="54" targetPointY="66" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="336" version="1.2" width="278" xmlns="http://www.w3.org/2000/svg">
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,73" startDistance="0">
							<layoutPath allocation="start" layoutDistance="53" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Quality_Eva_3678163547" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="205,73" startDistance="0">
							<layoutPath allocation="start" layoutDistance="50" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Goal_user_3670396974" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<rect fill="none" height="255" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-dasharray="4,2" stroke-width="1" width="228" x="50" y="81">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</rect>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,246" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Task_user_3670397845" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,299" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Ressource_Eva_3678163788" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<ellipse cx="54" cy="65.5" fill="rgb(255,255,255)" rx="24" ry="24.5" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="3.6e2" sym:sweepAngle="-3.6e2">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</ellipse>
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="12" font-style="normal" font-weight="normal" height="49" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="48" x="30" y="41">
						Techno-
logical
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
				</svg>
			</objectSymbol>
			<icon offset="30,60" xmlns="http://www.metacase.com/icon">
				<svg baseProfile="tiny" height="80" version="1.2" width="40" xmlns="http://www.w3.org/2000/svg">
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="14" font-style="normal" font-weight="bold" height="20" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="10" x="30" y="60">T</textArea>
				</svg>
			</icon>
		</object>
		<object id="Object_Environmental_user_3671098790" type="Object_Environmental_user_3671098790" typeName="Environmental">
			<description></description>
			<superType>
				<object href="#Object_PESTELFactor_user_3670396439"></object>
			</superType>
			<objectSymbol offset="32,31" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="32,41 40,30 70,30 80,41 80,70 70,79 41,80 32,69 32,41" targetPointX="56" targetPointY="55" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="326" version="1.2" width="278" xmlns="http://www.w3.org/2000/svg">
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,63" startDistance="0">
							<layoutPath allocation="start" layoutDistance="53" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Quality_Eva_3678163547" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="205,63" startDistance="0">
							<layoutPath allocation="start" layoutDistance="50" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Goal_user_3670396974" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<rect fill="none" height="255" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-dasharray="4,2" stroke-width="1" width="228" x="50" y="71">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</rect>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,236" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Task_user_3670397845" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,289" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Ressource_Eva_3678163788" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<ellipse cx="56" cy="55.5" fill="rgb(255,255,255)" rx="24" ry="24.5" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="3.6e2" sym:sweepAngle="-3.6e2">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</ellipse>
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="12" font-style="normal" font-weight="normal" height="49" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="48" x="32" y="31">
						Environ-
mental
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
				</svg>
			</objectSymbol>
			<icon offset="30,50" xmlns="http://www.metacase.com/icon">
				<svg baseProfile="tiny" height="70" version="1.2" width="40" xmlns="http://www.w3.org/2000/svg">
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="14" font-style="normal" font-weight="bold" height="20" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="10" x="30" y="50">E</textArea>
				</svg>
			</icon>
		</object>
		<object id="Object_Legal_user_3671098943" type="Object_Legal_user_3671098943" typeName="Legal">
			<description></description>
			<superType>
				<object href="#Object_PESTELFactor_user_3670396439"></object>
			</superType>
			<objectSymbol offset="32,31" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="40,30 70,30 80,40 80,70 70,80 40,80 30,70 30,40 40,30" targetPointX="55" targetPointY="55" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="326" version="1.2" width="278" xmlns="http://www.w3.org/2000/svg">
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,63" startDistance="0">
							<layoutPath allocation="start" layoutDistance="53" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Quality_Eva_3678163547" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="205,63" startDistance="0">
							<layoutPath allocation="start" layoutDistance="50" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Goal_user_3670396974" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<rect fill="none" height="255" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-dasharray="4,2" stroke-width="1" width="228" x="50" y="71">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</rect>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,236" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Task_user_3670397845" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,289" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Ressource_Eva_3678163788" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<ellipse cx="56" cy="55.5" fill="rgb(255,255,255)" rx="24" ry="24.5" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="3.6e2" sym:sweepAngle="-3.6e2">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</ellipse>
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="49" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="48" x="32" y="31">
						Legal
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
				</svg>
			</objectSymbol>
			<icon offset="30,40" xmlns="http://www.metacase.com/icon">
				<svg baseProfile="tiny" height="60" version="1.2" width="40" xmlns="http://www.w3.org/2000/svg">
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="14" font-style="normal" font-weight="bold" height="20" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="10" x="30" y="40">L</textArea>
				</svg>
			</icon>
		</object>
		<object id="Object_Actor_user_3670410876" type="Object_Actor_user_3670410876" typeName="Actor">
			<description></description>
			<slot id="a6jaaw" name="Name" unique="false">
				<property href="#Property_Name_user_3669789122"></property>
			</slot>
			<identProp slotID="a6jaaw"></identProp>
			<objectSymbol offset="50,60" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="50,60 110,60 110,120 50,120 50,60" targetPointX="80" targetPointY="90" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="120" version="1.2" width="110" xmlns="http://www.w3.org/2000/svg">
					<ellipse cx="80" cy="90" fill="rgb(255,255,255)" rx="30" ry="30" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="3.6e2" sym:sweepAngle="-3.6e2">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</ellipse>
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="60" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="60" x="50" y="60">
						PropertyTextSource:a6jaaw
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
				</svg>
			</objectSymbol>
			<icon offset="50,60" xmlns="http://www.metacase.com/icon">
				<svg baseProfile="tiny" height="80" version="1.2" width="70" xmlns="http://www.w3.org/2000/svg">
					<ellipse cx="60" cy="70" fill="none" rx="10" ry="10" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="0.0e0" sym:sweepAngle="3.6e2"></ellipse>
				</svg>
			</icon>
		</object>
		<object id="Object_Agent_Eva_3688460206" type="Object_Agent_Eva_3688460206" typeName="Agent">
			<description></description>
			<slot id="aa107d" name="Name" unique="false">
				<property href="#Property_Name_user_3669789122"></property>
			</slot>
			<identProp slotID="aa107d"></identProp>
			<objectSymbol offset="50,60" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="50,60 110,60 110,120 50,120 50,60" targetPointX="80" targetPointY="90" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="120" version="1.2" width="110" xmlns="http://www.w3.org/2000/svg">
					<ellipse cx="80" cy="90" fill="rgb(255,255,255)" rx="30" ry="30" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="3.6e2" sym:sweepAngle="-3.6e2">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</ellipse>
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="50" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="60" x="50" y="70">
						PropertyTextSource:aa107d
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
					<line stroke="rgb(0,0,0)" stroke-width="1" x1="58" x2="102" y1="70" y2="70">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</line>
				</svg>
			</objectSymbol>
			<icon offset="50,60" xmlns="http://www.metacase.com/icon">
				<svg baseProfile="tiny" height="120" version="1.2" width="110" xmlns="http://www.w3.org/2000/svg">
					<ellipse cx="80" cy="90" fill="none" rx="30" ry="30" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="0.0e0" sym:sweepAngle="3.6e2"></ellipse>
					<line stroke="rgb(0,0,0)" stroke-width="1" x1="58" x2="102" y1="70" y2="70"></line>
				</svg>
			</icon>
		</object>
		<object id="Object_ActorWithBoundary_Eva_3678555503" type="Object_ActorWithBoundary_Eva_3678555503" typeName="ActorWithBoundary">
			<description></description>
			<slot id="a88f6i" name="Name" unique="false">
				<property href="#Property_Name_user_3669789122"></property>
			</slot>
			<slot id="a97jte" name="Analyse" unique="false">
				<property id="Property_Analyse_Eva_3685253641" type="Property_Analyse_Eva_3685253641" typeName="Analyse">
					<description></description>
					<dataType>
						<simpleType>Boolean</simpleType>
					</dataType>
					<defaultValue>
						<bool>false</bool>
					</defaultValue>
				</property>
			</slot>
			<identProp slotID="a88f6i"></identProp>
			<objectSymbol offset="30,41" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="50,40 60,40 70,40 80,50 80,80 70,90 40,90 30,80 30,50 40,40 50,40" targetPointX="55" targetPointY="65" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="336" version="1.2" width="278" xmlns="http://www.w3.org/2000/svg">
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,73" startDistance="0">
							<layoutPath allocation="start" layoutDistance="53" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Quality_Eva_3678163547" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="205,73" startDistance="0">
							<layoutPath allocation="start" layoutDistance="50" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Goal_user_3670396974" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<rect fill="none" height="255" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-dasharray="4,2" stroke-width="1" width="228" x="50" y="81">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</rect>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,246" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Task_user_3670397845" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,299" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Ressource_Eva_3678163788" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<ellipse cx="54" cy="65.5" fill="rgb(255,255,255)" rx="24" ry="24.5" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="3.6e2" sym:sweepAngle="-3.6e2">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</ellipse>
					<ellipse cx="54" cy="65.5" fill="rgb(213,213,213)" rx="24" ry="24.5" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="0.0e0" sym:sweepAngle="3.6e2">
						<metaInfo xmlns="http://www.metacase.com/symbol">
							<displayCondition conditionOperator="=" matchString="T" xmlns="http://www.w3.org/2000/svg">PropertyTextSource:a97jte</displayCondition>
						</metaInfo>
					</ellipse>
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="49" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="48" x="30" y="41">
						PropertyTextSource:a88f6i
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
				</svg>
			</objectSymbol>
			<icon offset="40,50" xmlns="http://www.metacase.com/icon">
				<svg baseProfile="tiny" height="100" version="1.2" width="100" xmlns="http://www.w3.org/2000/svg">
					<rect fill="none" height="40" rx="6" ry="6" stroke="rgb(0,0,0)" stroke-dasharray="4,2" stroke-width="1" width="50" x="50" y="60"></rect>
					<ellipse cx="50" cy="60" fill="rgb(255,255,255)" rx="10" ry="10" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="3.6e2" sym:sweepAngle="-3.6e2"></ellipse>
				</svg>
			</icon>
		</object>
		<object id="Object_Agent_Eva_3688460308" type="Object_Agent_Eva_3688460308" typeName="AgentWithBoundary">
			<description></description>
			<slot id="ab10d1" name="Name" unique="false">
				<property href="#Property_Name_user_3669789122"></property>
			</slot>
			<slot id="ac10df" name="Analyse" unique="false">
				<property href="#Property_Analyse_Eva_3685253641"></property>
			</slot>
			<identProp slotID="ab10d1"></identProp>
			<objectSymbol offset="30,41" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="30,50 40,40 70,40 80,50 80,80 70,90 40,90 30,80 30,50" targetPointX="55" targetPointY="65" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="336" version="1.2" width="278" xmlns="http://www.w3.org/2000/svg">
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,73" startDistance="0">
							<layoutPath allocation="start" layoutDistance="53" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Quality_Eva_3678163547" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="205,73" startDistance="0">
							<layoutPath allocation="start" layoutDistance="50" lineSegmentTable="true" points="0,0 0,133" startDistance="50"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Goal_user_3670396974" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<rect fill="none" height="255" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-dasharray="4,2" stroke-width="1" width="228" x="50" y="81">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</rect>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,246" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Task_user_3670397845" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<template aligmentPointX="0.5" aligmentPointY="0.5" isMovable="false" revealConnectables="true" rotation="false" scaleFilter="0,0" subsymbolExtentX="100" subsymbolExtentY="50" useTargetpoint="false" width="1" xmlns="http://www.metacase.com/symbol">
						<pathLayout allocation="start" layoutDistance="40" lineSegmentTable="" points="100,299" startDistance="0">
							<layoutPath allocation="start" layoutDistance="105" lineSegmentTable="true,true" points="0,0 128,0 128,0" startDistance="0"></layoutPath>
						</pathLayout>
						<subgraphNPSource nonProperty="Object_Ressource_Eva_3678163788" source="Graph_Boundary_Eva_3674411585"></subgraphNPSource>
						<npSubsymbolSource></npSubsymbolSource>
						<metaInfo></metaInfo>
					</template>
					<ellipse cx="54" cy="65.5" fill="rgb(255,255,255)" rx="24" ry="24.5" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="0.0e0" sym:sweepAngle="3.6e2">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</ellipse>
					<ellipse cx="54" cy="65.5" fill="rgb(213,213,213)" rx="24" ry="24.5" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="0.0e0" sym:sweepAngle="3.6e2">
						<metaInfo xmlns="http://www.metacase.com/symbol">
							<displayCondition conditionOperator="=" matchString="T" xmlns="http://www.w3.org/2000/svg">PropertyTextSource:ac10df</displayCondition>
						</metaInfo>
					</ellipse>
					<line stroke="rgb(0,0,0)" stroke-width="1" x1="36" x2="72" y1="49" y2="49">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</line>
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="34" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="48" x="30" y="51">
						PropertyTextSource:ab10d1
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
				</svg>
			</objectSymbol>
			<icon offset="30,41" xmlns="http://www.metacase.com/icon">
				<svg baseProfile="tiny" height="250" version="1.2" width="278" xmlns="http://www.w3.org/2000/svg">
					<rect fill="none" height="169" rx="16" ry="16" stroke="rgb(0,0,0)" stroke-dasharray="4,2" stroke-width="1" width="228" x="50" y="81"></rect>
					<ellipse cx="54" cy="65.5" fill="rgb(255,255,255)" rx="24" ry="24.5" stroke="rgb(0,0,0)" stroke-width="1" sym:startAngle="0.0e0" sym:sweepAngle="3.6e2"></ellipse>
				</svg>
			</icon>
		</object>
		<object id="Object_Connector_Eva_3679812444" type="Object_Connector_Eva_3679812444" typeName="IntentionalElement">
			<description></description>
			<objectSymbol offset="100,60" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="100,60 120,60 120,84 100,84 100,60" targetPointX="110" targetPointY="72" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="84" version="1.2" width="120" xmlns="http://www.w3.org/2000/svg">
					<polygon fill="none" points="100,80 110,60 120,80" stroke="rgb(0,0,0)" stroke-width="1">
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</polygon>
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="12" font-style="normal" font-weight="normal" height="20" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="20" x="100" y="64">
						C
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
				</svg>
			</objectSymbol>
			<icon offset="50,60" xmlns="http://www.metacase.com/icon">
				<svg baseProfile="tiny" height="80" version="1.2" width="70" xmlns="http://www.w3.org/2000/svg">
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="14" font-style="normal" font-weight="normal" height="20" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="20" x="50" y="60">C</textArea>
				</svg>
			</icon>
		</object>
		<relationship id="Relationship_IsA_user_3670685458" type="Relationship_IsA_user_3670685458" typeName="isA">
			<description></description>
			<relationshipSymbol offset="50,80" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="50,80 90,80 90,100 50,100 50,80" targetPointX="70" targetPointY="90" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="100" version="1.2" width="90" xmlns="http://www.w3.org/2000/svg">
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="20" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="40" x="50" y="80">
						isA
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
				</svg>
			</relationshipSymbol>
		</relationship>
		<relationship id="Relationship_IsPartOf_user_3670685493" type="Relationship_IsPartOf_user_3670685493" typeName="participatesIn">
			<description></description>
			<relationshipSymbol offset="40,80" scaleFilter="1,1" xmlns="http://www.metacase.com/symbol">
				<defaultConnectable isSticky="true" points="40,80 120,80 120,100 40,100 40,80" targetPointX="80" targetPointY="90" usesGrid="false"></defaultConnectable>
				<svg baseProfile="tiny" height="100" version="1.2" width="120" xmlns="http://www.w3.org/2000/svg">
					<textArea display-align="center" fill="rgb(0,0,0)" font-family="#sans serif" font-size="15" font-style="normal" font-weight="normal" height="20" sym:characterBackgroundFill="none" sym:textboxFill="none" sym:textboxStroke="none" sym:textboxStroke-width="1" sym:wordWrap="true" text-anchor="middle" width="80" x="40" y="80">
						participatesIn
						<metaInfo xmlns="http://www.metacase.com/symbol"></metaInfo>
					</textArea>
				</svg>
			</relationshipSymbol>
		</relationship>
		<relationship id="Relationship_Depends_user_3670686520" type="Relationship_Depends_user_3670686520" typeName="dependerOf">
			<description></description>
		</relationship>
		<role id="Role_EnvironmentalFactor_user_3670685860" type="Role_EnvironmentalFactor_user_3670685860" typeName="Participation">
			<description></description>
			<roleSymbol xmlns="http://www.metacase.com/symbol">
				<rolelineGOs stroke="rgb(0,0,0)" stroke-width="1">
					<metaInfo shouldRotate="false"></metaInfo>
				</rolelineGOs>
				<svg baseProfile="tiny" height="85" version="1.2" width="150" xmlns="http://www.w3.org/2000/svg">
					<polygon fill="rgb(0,0,0)" points="140,75 150,80 140,85" stroke="rgb(0,0,0)" stroke-width="1">
						<metaInfo shouldRotate="true" xmlns="http://www.metacase.com/symbol"></metaInfo>
					</polygon>
				</svg>
			</roleSymbol>
		</role>
		<role id="Role_Member_user_3670685848" type="Role_Member_user_3670685848" typeName="Member">
			<description></description>
		</role>
		<role id="Role_Subclass_user_3670685838" type="Role_Subclass_user_3670685838" typeName="Subclass">
			<description></description>
		</role>
		<role id="Role_Superclass_user_3670685830" type="Role_Superclass_user_3670685830" typeName="Superclass">
			<description></description>
			<roleSymbol xmlns="http://www.metacase.com/symbol">
				<rolelineGOs stroke="rgb(0,0,0)" stroke-width="1">
					<metaInfo shouldRotate="false"></metaInfo>
				</rolelineGOs>
				<svg baseProfile="tiny" height="85" version="1.2" width="150" xmlns="http://www.w3.org/2000/svg">
					<polygon fill="rgb(0,0,0)" points="140,75 150,80 140,85" stroke="rgb(0,0,0)" stroke-width="1">
						<metaInfo shouldRotate="true" xmlns="http://www.metacase.com/symbol"></metaInfo>
					</polygon>
				</svg>
			</roleSymbol>
		</role>
		<role id="Role_Dependee_user_3670410722" type="Role_Dependee_user_3670410722" typeName="Dependee">
			<description></description>
			<roleSymbol xmlns="http://www.metacase.com/symbol">
				<rolelineGOs stroke="rgb(0,0,0)" stroke-width="1">
					<metaInfo shouldRotate="false"></metaInfo>
				</rolelineGOs>
				<svg baseProfile="tiny" height="0" version="1.2" width="0" xmlns="http://www.w3.org/2000/svg"></svg>
			</roleSymbol>
		</role>
		<role id="Role_Depender_user_3670410712" type="Role_Depender_user_3670410712" typeName="Depender">
			<description></description>
			<roleSymbol xmlns="http://www.metacase.com/symbol">
				<rolelineGOs stroke="rgb(0,0,0)" stroke-width="1">
					<metaInfo shouldRotate="false"></metaInfo>
				</rolelineGOs>
				<svg baseProfile="tiny" height="85" version="1.2" width="50" xmlns="http://www.w3.org/2000/svg">
					<line stroke="rgb(0,0,0)" stroke-width="1" x1="50" x2="50" y1="75" y2="85">
						<metaInfo shouldRotate="true" xmlns="http://www.metacase.com/symbol"></metaInfo>
					</line>
					<path d="M50,75 L45,75 L41.6964,77.0312 L40,80 L41.6964,82.9687 L45,85 L50,85" fill="none" stroke="rgb(0,0,0)" stroke-width="1" sym:controlPoints="50,75 45,75 40,80 45,85 50,85">
						<metaInfo shouldRotate="true" xmlns="http://www.metacase.com/symbol"></metaInfo>
					</path>
				</svg>
			</roleSymbol>
		</role>
		<binding>
			<relationship href="#Relationship_Depends_user_3670686520"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Depender_user_3670410712"></role>
				<object href="#Object_Actor_user_3670410876"></object>
				<object href="#Object_Agent_Eva_3688460206"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Dependee_user_3670410722"></role>
				<object href="#Object_Connector_Eva_3679812444"></object>
			</connection>
		</binding>
		<binding>
			<relationship href="#Relationship_Depends_user_3670686520"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Depender_user_3670410712"></role>
				<object href="#Object_ActorWithBoundary_Eva_3678555503"></object>
				<port href="#Object_Goal_user_3670396974"></port>
				<port href="#Object_Quality_Eva_3678163547"></port>
				<port href="#Object_Ressource_Eva_3678163788"></port>
				<port href="#Object_Task_user_3670397845"></port>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Dependee_user_3670410722"></role>
				<object href="#Object_Connector_Eva_3679812444"></object>
			</connection>
		</binding>
		<binding>
			<relationship href="#Relationship_Depends_user_3670686520"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Depender_user_3670410712"></role>
				<object href="#Object_Agent_Eva_3688460308"></object>
				<port href="#Object_Goal_user_3670396974"></port>
				<port href="#Object_Quality_Eva_3678163547"></port>
				<port href="#Object_Ressource_Eva_3678163788"></port>
				<port href="#Object_Task_user_3670397845"></port>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Dependee_user_3670410722"></role>
				<object href="#Object_Connector_Eva_3679812444"></object>
			</connection>
		</binding>
		<binding>
			<relationship href="#Relationship_Depends_user_3670686520"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Depender_user_3670410712"></role>
				<object href="#Object_Connector_Eva_3679812444"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Dependee_user_3670410722"></role>
				<object href="#Object_PESTELFactor_user_3670396439"></object>
				<port href="#Object_Goal_user_3670396974"></port>
				<port href="#Object_Quality_Eva_3678163547"></port>
				<port href="#Object_Ressource_Eva_3678163788"></port>
				<port href="#Object_Task_user_3670397845"></port>
			</connection>
		</binding>
		<binding>
			<relationship href="#Relationship_IsA_user_3670685458"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Subclass_user_3670685838"></role>
				<object href="#Object_Actor_user_3670410876"></object>
				<object href="#Object_ActorWithBoundary_Eva_3678555503"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Superclass_user_3670685830"></role>
				<object href="#Object_Actor_user_3670410876"></object>
				<object href="#Object_ActorWithBoundary_Eva_3678555503"></object>
			</connection>
		</binding>
		<binding>
			<relationship href="#Relationship_IsPartOf_user_3670685493"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Member_user_3670685848"></role>
				<object href="#Object_Actor_user_3670410876"></object>
				<object href="#Object_ActorWithBoundary_Eva_3678555503"></object>
				<object href="#Object_Agent_Eva_3688460206"></object>
				<object href="#Object_Agent_Eva_3688460308"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_EnvironmentalFactor_user_3670685860"></role>
				<object href="#Object_Actor_user_3670410876"></object>
				<object href="#Object_ActorWithBoundary_Eva_3678555503"></object>
				<object href="#Object_Agent_Eva_3688460206"></object>
				<object href="#Object_Agent_Eva_3688460308"></object>
			</connection>
		</binding>
		<binding>
			<relationship href="#Relationship_IsPartOf_user_3670685493"></relationship>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_Member_user_3670685848"></role>
				<object href="#Object_Actor_user_3670410876"></object>
				<object href="#Object_Agent_Eva_3688460206"></object>
			</connection>
			<connection>
				<cardinality start="1" stop="1"></cardinality>
				<role href="#Role_EnvironmentalFactor_user_3670685860"></role>
				<object href="#Object_PESTELFactor_user_3670396439"></object>
			</connection>
		</binding>
		<explosion>
			<object href="#Object_Actor_user_3670410876"></object>
			<graph href="#Graph_Boundary_Eva_3674411585"></graph>
		</explosion>
		<decomposition>
			<object href="#Object_ActorWithBoundary_Eva_3678555503"></object>
			<graph href="#Graph_ActorBoundary_Eva_3683465966"></graph>
		</decomposition>
		<decomposition>
			<object href="#Object_Agent_Eva_3688460308"></object>
			<graph href="#Graph_ActorBoundary_Eva_3683465966"></graph>
		</decomposition>
		<decomposition>
			<object href="#Object_Ecology_user_3670396717"></object>
			<graph href="#Graph_FactorBoundary_Eva_3683465953"></graph>
		</decomposition>
		<decomposition>
			<object href="#Object_Environmental_user_3671098790"></object>
			<graph href="#Graph_FactorBoundary_Eva_3683465953"></graph>
		</decomposition>
		<decomposition>
			<object href="#Object_Legal_user_3671098943"></object>
			<graph href="#Graph_FactorBoundary_Eva_3683465953"></graph>
		</decomposition>
		<decomposition>
			<object href="#Object_Politics_user_3670396476"></object>
			<graph href="#Graph_FactorBoundary_Eva_3683465953"></graph>
		</decomposition>
		<decomposition>
			<object href="#Object_Social_user_3671098460"></object>
			<graph href="#Graph_FactorBoundary_Eva_3683465953"></graph>
		</decomposition>
		<decomposition>
			<object href="#Object_Technological_user_3671098683"></object>
			<graph href="#Graph_FactorBoundary_Eva_3683465953"></graph>
		</decomposition>
		<report>Report '!ExportRDF'

subreport '_Reverse engineer RDF translators' run

/*variable 'pathAndFilename' write
	prompt 'Please enter the path: ' ask 
close */

filename 'C:\Users\metaedit\Documents\MetaEdit+ 5.5\reports\PESTEListar\RDFFile.ttl' write

	subreport '_PrintPrefix' run
	
	foreach .IntentionalElement {
		
		variable 'conUUID' write
			''
		close 
		
		subreport '_PrintRDFType' run		
		subreport '_PrintDependingRelationForConnectors' run

		'.'
		newline
		newline
		
	}
		
	
	foreach .(Actor|Agent)	{			
		subreport '_PrintRDFType' run		
		subreport '_PrintDependingRelation' run													
		subreport '_PrintIsARelation' run
		subreport '_PrintParticipatesInRelation' run			
		'.'
		newline
		newline
	}

	
	foreach .(Political|Economic|Social|Technological|Environmental|Legal|ActorWithBoundary|AgentWithBoundary){
	
		subreport '_PrintRDFTypesForBoundaryObjects' run		
		subreport '_PrintIsARelation' run
		subreport '_PrintParticipatesInRelation' run		
		subreport '_DoDecompositions' run
			
		'.'
		newline
		newline
	}
	
	variable 'subgraphs' read 
	close


endreport</report>
		<report>Report '!OP Analyse'

subreport '_Reverse engineer RDF translators' run

	
foreach .(ActorWithBoundary|AgentWithBoundary) {
	
	variable 'actors' append
		id
		newline
	close
}


variable 'input' write
	prompt 'Please enter an actor with boundary for the analyse: ' ask 
close 

$true = 'f'

dowhile $actors {

	if $true = 'f' then		
		if id = $input then
			$true = 't'			
		endif		
	endif
}	

if $true = 't' then
	
	internal 'forAll:run: PESTEL* !ExportRDF' execute
	
	external 'java -cp "C:/temp/OTanalyse-0.0.1-SNAPSHOT/bin/OTanalyse-0.0.1-SNAPSHOT.jar;C:/temp/OTanalyse-0.0.1-SNAPSHOT/lib/*" at/jku/dke/OTanalyse.App -g "C:\Users\metaedit\Documents\MetaEdit+ 5.5\reports\PESTEListar\RDFFile.ttl" -a ' $input%var ' -d false' executeBlocking
	
else
	'There is no actor with boundary with the name: ' $input
	newline
	'Please try again!'
endif

endreport</report>
		<report>Report '!ResetOPAnalyse'

	external 'java -cp "C:/temp/OTanalyse-0.0.1-SNAPSHOT/bin/OTanalyse-0.0.1-SNAPSHOT.jar;C:/temp/OTanalyse-0.0.1-SNAPSHOT/lib/*" at/jku/dke/OTanalyse.App -g false -a false -d true' executeBlocking

endreport</report>
		<report>Report 'ImportRDF'
	
	/*Ask user for rdf file */
	variable 'rdfFileName' write
		prompt 'Select RDF file for import!' askFilename
	close 
	
	
	/* Call java programm */
	external 'java -cp "C:/temp/pestel-0.0.1-SNAPSHOT/bin/pestel-0.0.1-SNAPSHOT.jar;C:/temp/pestel-0.0.1-SNAPSHOT/lib/*" importMain.RDFImport ' $rdfFileName executeBlocking
	
	/* Imports the generated file into MetaEdit+ */
	internal 'fileInPatch: "' 'C:\temp\output.mxm"' execute
	
	
endreport</report>
		<report>Report 'import_testMDXFile'
	
	variable 'filename' write
		prompt 'Select file for import!' askFilename
	close 
		
	internal 'fileInPatch: "' $filename '"' execute
	
endreport</report>
		<report>Report '_AddBinding'

if $pred = 'dependerOf' then
	variable 'bindings' append
'			&lt;binding &gt;
				&lt;relationship type="Depends" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Depender" &gt;&lt;/role&gt;
					&lt;object href="#' $sub '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="Dependee" &gt;&lt;/role&gt;
					&lt;object href="#' $obj '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
	close
endif

if $pred = 'isPartOf' then
	variable 'bindings' append
'			&lt;binding &gt;
				&lt;relationship type="IsPartOf" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Member" &gt;&lt;/role&gt;
					&lt;object href="#' $sub '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="EnvironmentalFactor" &gt;&lt;/role&gt;
					&lt;object href="#' $obj '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
	close
endif

if $pred = 'isA' then
	variable 'bindings' append
'			&lt;binding &gt;
				&lt;relationship type="IsA" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Subclass" &gt;&lt;/role&gt;
					&lt;object href="#' $sub '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="Superclass" &gt;&lt;/role&gt;
					&lt;object href="#' $obj '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
	close
endif

if $pred = 'hurt' then
	variable 'bindings' append
'			&lt;binding &gt;
				&lt;relationship type="Hurt" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Injurer" &gt;&lt;/role&gt;
					&lt;object href="#' $sub '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="Injuree" &gt;&lt;/role&gt;
					&lt;object href="#' $obj '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
	close
endif

if $pred = 'help' then
	variable 'bindings' append
'			&lt;binding &gt;
				&lt;relationship type="Help" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Helper" &gt;&lt;/role&gt;
					&lt;object href="#' $sub '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="Helpee" &gt;&lt;/role&gt;
					&lt;object href="#' $obj '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
	close
endif

if $pred = 'actorBoundaryComprises' then
	variable 'bindings' append
'			&lt;binding &gt;
				&lt;relationship type="FactorBoundaryComprises" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Factor" &gt;&lt;/role&gt;
					&lt;object href="#' $sub '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="BoundaryObject" &gt;&lt;/role&gt;
					&lt;object href="#' $obj '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
	close
endif

endreport</report>
		<report>Report '_AddBindingForSubgraphs'


if $pred = 'hurt' then
	
'			&lt;binding &gt;
				&lt;relationship type="Hurt" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Injurer" &gt;&lt;/role&gt;
					&lt;object href="#' $sub '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="Injuree" &gt;&lt;/role&gt;
					&lt;object href="#' $obj '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'

endif

if $pred = 'help' then
	
'			&lt;binding &gt;
				&lt;relationship type="Help" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Helper" &gt;&lt;/role&gt;
					&lt;object href="#' $sub '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="Helpee" &gt;&lt;/role&gt;
					&lt;object href="#' $obj '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
	
endif

endreport</report>
		<report>Report '_AddBindingWithPort'

if $pred = 'dependerOf' then
'			&lt;binding &gt;
				&lt;relationship type="Depends" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Depender" &gt;&lt;/role&gt;
					&lt;object href="#' $trueFactor '"&gt;&lt;/object&gt;
					&lt;port href="#' $sub '"&gt;&lt;/port&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="Dependee" &gt;&lt;/role&gt;
					&lt;object href="#' $obj '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
endif




if $pred = 'hurt' then
'			&lt;binding &gt;
				&lt;relationship type="Hurt" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Injurer" &gt;&lt;/role&gt;
					&lt;object href="#' $trueFactor '"&gt;&lt;/object&gt;
					&lt;port href="#' $sub '"&gt;&lt;/port&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="Injuree" &gt;&lt;/role&gt;
					&lt;object href="#' $obj '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
endif

if $pred = 'help' then
'			&lt;binding &gt;
				&lt;relationship type="Help" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Helper" &gt;&lt;/role&gt;
					&lt;object href="#' $trueFactor '"&gt;&lt;/object&gt;
					&lt;port href="#' $sub '"&gt;&lt;/port&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="Helpee" &gt;&lt;/role&gt;
					&lt;object href="#' $obj '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
endif



endreport</report>
		<report>Report '_AddBindingWithPortInSupergraph'

if $pred = 'dependerOf' then
'			&lt;binding &gt;
				&lt;relationship type="Depends" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Depender" &gt;&lt;/role&gt;
					&lt;object href="#' $sub '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="Dependee" &gt;&lt;/role&gt;
					&lt;object href="#' $factor '"&gt;&lt;/object&gt;
					&lt;port href="#' $obj '"&gt;&lt;/port&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
endif




if $pred = 'hurt' then
'			&lt;binding &gt;
				&lt;relationship type="Hurt" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Injurer" &gt;&lt;/role&gt;
					&lt;object href="#' $sub '"&gt;&lt;/object&gt;					
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="Injuree" &gt;&lt;/role&gt;
					&lt;object href="#' $factor '"&gt;&lt;/object&gt;
					&lt;port href="#' $obj '"&gt;&lt;/port&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
endif

if $pred = 'help' then
'			&lt;binding &gt;
				&lt;relationship type="Help" &gt;&lt;/relationship&gt;
				&lt;connection&gt;
					&lt;role type="Helper" &gt;&lt;/role&gt;
					&lt;object href="#' $sub '"&gt;&lt;/object&gt;
				&lt;/connection&gt;
				&lt;connection&gt;
					&lt;role type="Helpee" &gt;&lt;/role&gt;
					&lt;object href="#' $factor '"&gt;&lt;/object&gt;
					&lt;port href="#' $obj '"&gt;&lt;/port&gt;
				&lt;/connection&gt;
			&lt;/binding&gt;	
'
endif



endreport</report>
		<report>Report '_closeSubgraph'

'
			&lt;/graph&gt;
		&lt;/object&gt;
'

endreport</report>
		<report>Report '_DoDecompositions'
		
		do decompositions {
			
			foreach .(Task|Goal|Quality|Ressource)	{
				
				
				';'
				newline
				'	istar:wants '
				':'id%var
				
				variable 'subgraphs' append
				
					$sub = id%var
					':'id%var ' rdf:type ' 'istar:' type
					
					if ~Helper&gt;Helps~Helpee.() &lt;&gt; '' then 
						';'
						newline
						dowhile ~Helper&gt;Helps~Helpee.()
						{
							'	istar:helps '
							':'id%var ';'
							newline 
						}
					endif
					
					
					if ~Qualifier&gt;Qualifies~Qualifiee.() &lt;&gt; '' then 
						';'
						newline
						dowhile ~Qualifier&gt;Qualifies~Qualifiee.()
						{
							'	istar:qualifies '
							':'id%var ';'
							newline 
						}
					endif
					
					if ~Refiner&gt;Refines~Refinee.() &lt;&gt; '' then 
						';'
						newline
						dowhile ~Refiner&gt;Refines~Refinee.()
						{
							'	istar:refines '
							':'id%var ';'
							newline 
						}
					endif
					
					if ~Injurer&gt;Hurts~Injuree.() &lt;&gt; '' then 
						';'
						newline
						dowhile ~Injurer&gt;Hurts~Injuree.()
						{
							'	istar:hurts '
							':'id%var ';'
							newline 
						}
					endif
					
					$next = 'f'
					
					do $factor {
						$line = id
						
						if $next = 't' then
							';'
							newline
							'	'$line
							$next = 'f'
						endif
						
												
						if $line = $sub then
							
							$next = 't'  
						
						endif
					
					}
					
					
					'.'
					newline
					newline

				close
				
			}
		
		}
endreport</report>
		<report>Report '_GenerateUUID'
	
	external 'java -jar C:\Users\metaedit\UUIDGenerator.jar C:\Users\metaedit\UUID.txt' executeBlocking

	
endreport</report>
		<report>Report '_handleFactorsAndSubgraphs'

variable 'factorPart' write
	''
close 

variable 'subgraphPart' write
	''
close 

variable 'Political' write
	''
close

variable 'Economic' write
	''
close

variable 'Social' write
	''
close

variable 'Technological' write
	''
close

variable 'Environmental' write
	''
close

variable 'Legal' write
	''
close

variable 'PoliticalBindings' write
	''
close

variable 'EconomicBindings' write
	''
close

variable 'SocialBindings' write
	''
close

variable 'TechnologicalBindings' write
	''
close

variable 'EnvironmentalBindings' write
	''
close

variable 'LegalBindings' write
	''
close

variable 'XMLFactorsAndSubgraphs' write
	
close 


/*Subreport for separating file in 2 parts - factors and subgraphs */
subreport '_separateFiles2' run


do $factorPart {
	$line = id
		
	$count = ''
	$count2 = '1'
	
	
	/*Check if "." at the end. Means end of the statement */
		if ($line =/ '[a-zA-Z\s:]+\.' or $line =/ '[a-zA-Z\s:]+;') then
			$words = $line%spaces
			
			do $words {
										
				$count++%null				
			}
			
			do $words {
				
					if $count = '3' then
		
						if $count2 = '1' or $count2 = '2' then
							
							if $count2 = '1' then
								$sub = id%delPrefix%delDoubPoint
								$count2 = '2'
							else
								$pred = id%delPrefix%delDoubPoint
								$count2 = '3'
							endif
						
						else
							$obj = id%delPrefix%delDoubPoint
							$count2 = '1'
							
							variable $sub append
								'		&lt;object id="' $sub '" type="' $sub '"&gt;'
								newline
								'			&lt;graph id="' $sub 'Boundary" type="Boundary"&gt;'
								newline
							close 
																													
						endif			
											
					endif
					
					
					if $count = '2' then
					
						
						if $count2 = '1' then
							$pred = id%delPrefix%delDoubPoint
							$count2 = '2'
						else
							$obj = id%delPrefix%delDoubPoint
							$count2 = '1'
							
							variable 'factorBoundaries' append
									$sub
									newline
									$obj
									newline
							close
							
						endif
				
					endif			
			}
		endif
		
}

$trueFactor = ''

do $subgraphPart {
	$line = id
		
	$count = ''
	$count2 = '1'
	
	
	/*Check if "." at the end. Means end of the statement */
		if ($line =/ '[a-zA-Z\s:]+\.' or $line =/ '[a-zA-Z\s:]+;') then
			$words = $line%spaces
			
			do $words {
										
				$count++%null				
			}
			
			
			
			do $words {
				
					if $count = '3' then
		
						if $count2 = '1' or $count2 = '2' then
							
							if $count2 = '1' then
								$sub = id%delPrefix%delDoubPoint
								$count2 = '2'
							else
								$pred = id%delPrefix%delDoubPoint
								$count2 = '3'
							endif
						
						else
							$obj = id%delPrefix%delDoubPoint
							$count2 = '1'
							
							$factor = ''
							$subgraph = ''
							$count = '0'
							
							/*Check to with factor the object depends */
							do $factorBoundaries {
								$line = id

								if $line = 'Economic' or $line = 'Political' or $line = 'Social' or $line = 'Technological' or $line = 'Environmental' or $line = 'Legal' then
									$factor = $line
									$count = '0'
								else
									$subgraph = $line
									$count = '2'
								endif
								
								if $count = '2' then
									if $subgraph = $sub then
										variable $factor append
											subreport '_WriteRDFTypeForSubgraphs' run
										close
										
										$trueFactor = $factor
										
									endif
								endif
							
							}
																																															
						endif			
											
					endif
					
					
					if $count = '2' then
					
						
						if $count2 = '1' then
							$pred = id%delPrefix%delDoubPoint
							$count2 = '2'
						else
							$obj = id%delPrefix%delDoubPoint
							$count2 = '1'
							
							$supergraphBinding = 't'
							
							/*Check if binding within subgraph; if not note in new variable */
							do $factorBoundaries {
								$line = id
								

								if $line = 'Economic' or $line = 'Political' or $line = 'Social' or $line = 'Technological' or $line = 'Environmental' or $line = 'Legal' then
									$factor = $line
									$count = '0'
								else
									$subgraph = $line
									$count = '2'
								endif
								
								if $count = '2' then
									if $subgraph = $obj then
										variable $factor 'Bindings' append
											subreport '_AddBindingForSubgraphs' run
										close
										
										$supergraphBinding = 'f'
									endif
								endif
							
							}
							
							if $supergraphBinding = 't' then
								
								variable 'bindingsForSupergraph' append
									subreport '_AddBindingWithPort' run 
								close 
								
							endif
							
						endif
				
					endif			
			}
		endif
		
}

variable 'XMLFactorsAndSubgraphs' append
	if $Political &lt;&gt; '' then
		variable 'Political' read 	
		variable 'PoliticalBindings' read
		subreport '_closeSubgraph' run
	endif
	
	if $Economic &lt;&gt; '' then 
		variable 'Economic' read 	
		variable 'EconomicBindings' read 
		subreport '_closeSubgraph' run
	endif
	
	if $Social &lt;&gt; '' then
		variable 'Social' read 	
		variable 'SocialBindings' read 
		subreport '_closeSubgraph' run
	endif
	
	if $Technological &lt;&gt; '' then
		variable 'Technological' read 	
		variable 'TechnologicalBindings' read 
		subreport '_closeSubgraph' run
	endif
	
	if $Environmental &lt;&gt; '' then
		variable 'Environmental' read 	
		variable 'EnvironmentalBindings' read 
		subreport '_closeSubgraph' run
	endif
	
	if $Legal &lt;&gt; '' then
		variable 'Legal' read 	
		variable 'LegalBindings' read 
		subreport '_closeSubgraph' run
	endif
close 


endreport</report>
		<report>Report '_Import RDF_alt'

/* Reverse engineer RDF file into PESTEListar model */

variable 'dd' write
	subreport '_default directory' run
close

/* By default, reverse engineer the default reports directory */
$dir = $dd /*can change to a string*/

subreport '_Reverse engineer RDF dir' run
subreport '_Reverse engineer RDF translators' run
subreport '_Reverse engineer RDF file' run
subreport '_Reverse engineer RDF import' run


endreport</report>
		<report>Report '_lineByLine'

/* Store the current RDF file contents in a variable */
variable 'file' write
	filename $filename read
close

/*Define variables*/
variable 'firstPart' write
	''
close

variable 'secondPart' write
	''
close

variable 'factorBoundaries' write
	''
close

variable 'bindingsForSupergraph' write
	''
close 


$second = 'f'


/*run subreport*/
subreport '_separateFiles' run
subreport '_handleFactorsAndSubgraphs' run

/*Write XML Code for factors and subgraphs do file */
variable 'XMLFactorsAndSubgraphs' read 


$sub = ''
$pred = ''
$obj = ''
$rdfType = ''

/* Goes through the current RDF file line-by-line */
do $firstPart {
	$line = id
		
	$count = ''
	$count2 = '1'
	
		
	$words = $line%spaces
	
	do $words {
								
		$count++%null				
	}
	
	
	do $words {
	/*If Statement decribes RDF-Type */
		if $count = '3' then

			
			if $count2 = '1' or $count2 = '2' then
				
				if $count2 = '1' then
					$sub = id%delPrefix%delDoubPoint
					$count2 = '2'
				else
					$pred = id%delPrefix%delDoubPoint
					$count2 = '3'
				endif
			
			else
				$obj = id%delPrefix%delDoubPoint
				$count2 = '1'
				subreport '_WriteRDFType' run							
			endif			
								
		endif
		
	/*If its a relationship statement*/
		if $count = '2' then
		
			
			if $count2 = '1' then
				$pred = id%delPrefix%delDoubPoint
				$count2 = '2'
			else
				$obj = id%delPrefix%delDoubPoint
				$count2 = '1'
				$normalBinding = 't'
												
				do $factorBoundaries {
					$line = id
					
	
					if $line = 'Economic' or $line = 'Political' or $line = 'Social' or $line = 'Technological' or $line = 'Environmental' or $line = 'Legal' then
						$factor = $line
						$count = '0'
					else
						$subgraph = $line
						$count = '2'
					endif
					
					if $count = '2' then
						if $subgraph = $obj then
							variable 'bindings' append
								subreport '_AddBindingWithPortInSupergraph' run
							close
							
							$normalBinding = 'f'
						endif
					endif
					
					
				
				}
				
				if $normalBinding = 't' then
						subreport '_AddBinding' run
					endif
					
							
			endif
			
			
	
		endif			
	}

}
endreport</report>
		<report>Report '_PrintConnectorDependingRelation'
	if (~Dependee&gt;dependerOf~Depender#() &lt;&gt; '') and (~Depender&gt;dependerOf~Dependee#() &lt;&gt; '') then
			
		$sub = ''
		$obj = ''
		
		if ~Dependee&gt;dependerOf~Depender#() &lt;&gt; '' then
			
			dowhile ~Dependee&gt;dependerOf~Depender#() {
				$sub = id%var
				 
			}
			
		endif
		
		if ~Depender&gt;dependerOf~Dependee#() &lt;&gt; '' then
			
			dowhile ~Depender&gt;dependerOf~Dependee#() {
				$obj = id%var
				 
			}
			
		endif
		
		variable 'factor' append
				$sub
				newline
				'istar:dependerOf :' $obj
				newline
				$obj
				newline
				'istar:dependeeOf :' $sub
				newline
		close 
			
	endif
endreport</report>
		<report>Report '_PrintDependingRelation'
	$sub = id%var	
	$next = 'f'
				
	do $dependingForActors {
		$line = id
		
		if $next = 't' then
			';'
			newline
			'	'$line
			$next = 'f'
		endif
		
								
		if $line = $sub then
			
			$next = 't'  
		
		endif
	
	}
		
		
endreport</report>
		<report>Report '_PrintDependingRelationForConnectors'
	if ~Depender&gt;dependerOf~Dependee.() &lt;&gt; '' then 
			
			';'
			newline
			
			if ~Depender&gt;dependerOf~Dependee#() &lt;&gt; '' then
				
				$obj = $conUUID
				
				dowhile ~Depender&gt;dependerOf~Dependee#()
				{
					'	istar:dependerOf '
					':'id%var
					
					variable 'factor' append
						id%var
						newline
						'istar:dependeeOf :' $obj
						newline
					close 
				}
				
			else
			
				dowhile ~Depender&gt;dependerOf~Dependee.()
				{
					'	istar:dependerOf '
					':'id%var ';'
					newline
										 
				}				
			endif

		endif
		
		
		if ~Dependee&gt;dependerOf~Depender.() &lt;&gt; '' then 
			
			';'
			newline
			$obj = $conUUID
			
			if ~Dependee&gt;dependerOf~Depender#() &lt;&gt; '' then
				
				
				
				dowhile ~Dependee&gt;dependerOf~Depender#()
				{
					
					'	istar:dependeeOf '
					':'id%var 
					
					
					variable 'factor' append
						id%var
						newline
						'istar:dependerOf :' $obj
						newline
					close 
				}
				
			else
			
				dowhile ~Dependee&gt;dependerOf~Depender.()
				{
					'	istar:dependeeOf '
					':'id%var
					
					variable 'dependingForActors' append
						id%var
						newline
						'istar:dependerOf :' $obj
						newline
					close 
					
				}				
			endif 
	
		endif
endreport</report>
		<report>Report '_PrintIsARelation'
	if ~Subclass&gt;IsA~Superclass.() &lt;&gt; '' then 
			';'
			newline
			dowhile ~Subclass&gt;IsA~Superclass.()
			{
				'	istar:isA '
				':'id%var ';'
				newline 
			}
	endif
endreport</report>
		<report>Report '_PrintParticipatesInRelation'
	if ~Member&gt;ParticipatesIn~Participation.() &lt;&gt; '' then 
			';'
			newline
			dowhile ~Member&gt;ParticipatesIn~Participation.()
			{
				'	istar:participatesIn '
				':'id%var ';'
				newline 
			}
	endif
endreport</report>
		<report>Report '_PrintPrefix'
	$prefix = :Default Prefix;
	
	if $prefix = '' then
		$prefix = 'http://example.org/'
	endif
	
	'@prefix rdf:   &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; .'
	newline
	'@prefix istar: &lt;http://xmlns.com/istar/0.1/&gt; .'
	newline
	'@prefix pestel: &lt;http://xmlns.com/pestel/0.1/&gt; .'
	newline
	'@prefix : &lt;' $prefix '&gt; .'
	newline
	newline
endreport</report>
		<report>Report '_PrintRDFType'

	if type = 'IntentionalElement' then
	
		subreport '_GenerateUUID' run
		
		variable 'conUUID' append
			filename 'C:\Users\metaedit\UUID.txt' read
		close
		
	   ':'$conUUID ' rdf:type ' 'istar:IntentionalElement'
	
	
	else 
	
		':'id%var ' rdf:type ' 'istar:' type
	
	endif 
endreport</report>
		<report>Report '_PrintRDFTypesForBoundaryObjects'

	if id='Political' or id = 'Economic' or id = 'Social' or id = 'Technological' or id = 'Environmental' or id = 'Legal' then 		
			'pestel:'id ' rdf:type ' 'pestel:PESTELFactor'		
	endif
	
	if type='ActorWithBoundary' then
		':'id%var ' rdf:type ' 'istar:Actor'
			
	endif
	
	if type='AgentWithBoundary' then
		':'id%var ' rdf:type ' 'istar:Agent'
			
	endif
	
endreport</report>
		<report>Report '_Reverse engineer RDF dir'

/* Save RDF file under $dir into $files as absolute filenames */

filename $dd 'dirclasses.bat' write
	'dir /b /s "' $dir sep '*.ttl" &gt;"' $dd 'classfiles.txt"' newline
	/* canonicalize $dir while we're here */
	'cd /D ' $dd newline
	'set absdd=%CD%' newline
	'cd /D ' $dir newline
	'cd &gt;"%absdd%\dir.txt"'
close
external '"' $dd 'dirclasses.bat' '"' executeBlocking
variable 'files' write
	filename $dd 'classfiles.txt' read
close

/* Make sure $dir is an absolute path with a final separator */
variable 'dir' write
	filename $dd 'dir.txt' read
close
do $dir where id&lt;&gt;'' 
{	variable 'dir' write
		id
		if not id =~ '*\' then '\' endif
	close
}

endreport</report>
		<report>
Report '_Reverse engineer RDF file'

/* index for the imported RDF file */
$graphNum='1'
do graphs where type = 'PESTEL i-star' and id =/ 'Reverse engineered RDF .*'
{	$graphNum++%null
}

/* create graph name and save it to list of created graphs */
variable 'graphName' write
	'Reverse engineered RDF ' $graphNum
close
variable 'graphs' append 
	$graphName newline 
close

/* Create .mxm file to be imported. File contains all the reverse engineered classes and attributes in the syntax of UML Class Diagram */

filename $dd $graphName '.mxm' encoding 'UTF-8' write
'&lt;?xml version="1.0" encoding="UTF-8"?&gt;
&lt;gxl xmlns="http://www.metacase.com/gxlGOPRR"&gt;
&lt;graph type="PESTEL i-star"&gt;
	&lt;slot name="Model name"&gt;
		&lt;value&gt;
			&lt;string&gt;' $graphName%xml '&lt;/string&gt;
		&lt;/value&gt;
	&lt;/slot&gt;
'

/*Define variable for writing bindings*/
variable 'bindings' write
	''
close


/*Goes trough all the RDF files and	their contents*/

do $files where id&lt;&gt;'' {
	$filename = id
	subreport '_lineByLine' run
}			

variable 'bindings' read
variable 'bindingsForSupergraph' read 


'&lt;/graph&gt;
&lt;/gxl&gt;'
close



endreport</report>
		<report>Report '_Reverse engineer RDF import'

/* Imports the generated file into MetaEdit+ */
do $graphs where id &lt;&gt; ''
{	internal 'fileInPatch: "' $dd id '.mxm"' execute
}

endreport</report>
		<report>Report '_Reverse engineer RDF translators'

subreport '_translators' run

/* Translator for translating the white spaces into newlines */
to '%spaces
/\s+/ $\
'
endto

/* Translator for deleting the white spaces */
to '%delSpaces
/\s+/ $
'
endto

/* Translator for translating the white spaces into underscores */
to '%spacesToUs
/\s+/ $\
_'
endto

/* Translator for translating the white spaces and = signs into newlines */
to '%spacesAndEquals
/\s+/ $\

= \
'
endto
to '%strip
; $'
endto

/*Translator for deleting ':' and ';' and '.' */
to '%delDoubPoint
: $
; $
. $
'
endto


/*Translator for deleting the prefix */
to '%delPrefix
/[a-zA-Z]+\:/ $
'
endto



/* Translator to backslash escape characters illegal in a translator */
to '%literal
\\ $:B?CKSL?SH:\\
\  $:B?CKSL?SH:\ 
\/ $:B?CKSL?SH:\/
\$ $:B?CKSL?SH:\$
\% $:B?CKSL?SH:\%
\- $:B?CKSL?SH:\-
\* $:B?CKSL?SH:\*
\
 $:B?CKSL?SH:\

$:B?CKSL?SH: $\\
' /* workaround for \-&gt;\\, necessary because of a bug in 4.5 SR1 */
endto

/* Translator to extract package name from filename beginning with $baseDir and ending with *.java */
to '%package
$' $dir%literal ' $
/\\?[^\\.]*\.java/ $
$\\ $.'
endto

/* Remove C-style comments (but not Java double backslash) */
to '%removeCComments
///[*]([^*]|([*]+([^*//])))*[*]+/// $'
endto

endreport</report>
		<report>Report '_separateFiles'


/*Separate file in first an second part */
do $file%undent {
	
	$line = id
	
	if $line =~ ':Economic*' or $line =~ ':Political*' or $line =~ ':Social*' or $line =~ ':Technological*' or $line =~ ':Environmental*' or $line =~ ':Legal*' then
		$second = 't'
	endif
	
	if ($second &lt;&gt; 't') and ($line =/ '[a-zA-Z\s:]+\.' or $line =/ '[a-zA-Z\s:]+;') then
	
		variable 'firstPart' append
			$line
			newline
		close
		
	else 
		if $line =/ '[a-zA-Z\s:]+\.' or $line =/ '[a-zA-Z\s:]+;' then
			
		
			variable 'secondPart' append
				$line
				newline
			close
		endif
	endif

}

endreport</report>
		<report>Report '_separateFiles2'

$second2 = 'f'

/*Separate file in first an second part */
do $secondPart {
	
	$line = id
	
	if not ($line =~ '*:PESTELFactor;' or $line =~ '*:PESTELFactor.' or $line =~ 'istar:actorBoundaryComprises*') then
		$second2 = 't'
	endif
	
	if $second2 &lt;&gt; 't' then
	
		variable 'factorPart' append
			$line
			newline
		close
		
	else
			variable 'subgraphPart' append
				$line
				newline
			close
	endif

}


endreport</report>
		<report>Report '_WriteRDFType'

/*check if it a PESTEL Factor*/
if $sub = 'Political' or $sub = 'Economic' or $sub = 'Social' or $sub = 'Technological' or $sub = 'Environmental' or $sub = 'Legal' then

'			&lt;object id="' $sub '" type="' $sub '"&gt;
			&lt;/object&gt;
'



else

'			&lt;object id="' $sub '" type="' $obj '"&gt;
				&lt;slot name="Name"&gt;
					&lt;value&gt;
						&lt;string&gt;' $sub '&lt;/string&gt;
					&lt;/value&gt;
				&lt;/slot&gt;
			&lt;/object&gt;
'
endif
endreport</report>
		<report>Report '_WriteRDFTypeForSubgraphs'

/*check if it a PESTEL Factor*/
if $sub = 'Political' or $sub = 'Economic' or $sub = 'Social' or $sub = 'Technological' or $sub = 'Environmental' or $sub = 'Legal' then

'			&lt;object id="' $sub '" type="' $sub '"&gt;
'



else

'			&lt;object id="' $sub '" type="' $obj '"&gt;
				&lt;slot name="Name"&gt;
					&lt;value&gt;
						&lt;string&gt;' $sub '&lt;/string&gt;
					&lt;/value&gt;
				&lt;/slot&gt;
			&lt;/object&gt;
'
endif


endreport</report>
		<constraints>
			<connectivity>
				<object href="#Object_Connector_Eva_3679812444"></object>
				<role href="#Role_Dependee_user_3670410722"></role>
				<max>1</max>
			</connectivity>
			<connectivity>
				<object href="#Object_Connector_Eva_3679812444"></object>
				<role href="#Role_Depender_user_3670410712"></role>
				<max>1</max>
			</connectivity>
			<occurrence>
				<object href="#Object_Ecology_user_3670396717"></object>
				<max>1</max>
			</occurrence>
			<occurrence>
				<object href="#Object_Environmental_user_3671098790"></object>
				<max>1</max>
			</occurrence>
			<occurrence>
				<object href="#Object_Legal_user_3671098943"></object>
				<max>1</max>
			</occurrence>
			<occurrence>
				<object href="#Object_Politics_user_3670396476"></object>
				<max>1</max>
			</occurrence>
			<occurrence>
				<object href="#Object_Social_user_3671098460"></object>
				<max>1</max>
			</occurrence>
			<occurrence>
				<object href="#Object_Technological_user_3671098683"></object>
				<max>1</max>
			</occurrence>
		</constraints>
	</graph>
</gxl>