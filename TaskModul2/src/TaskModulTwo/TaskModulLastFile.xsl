<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<head>Galery</head>
			<body>
				<table border="1">
					<tr align="center">
						<th rowspan="2">Name</th>
						<th rowspan="2">Soil</th>
						<th rowspan="2">Origin</th>
						<th colspan="2">Visual parameters</th>
						<th colspan="2">Growing tips</th>
						<th rowspan="2">Multiplying</th>
					</tr>
					<tr>
						<th>colour</th>
						<th>length</th>
						<th>temperature</th>
						<th>watering</th>
					</tr>
					<xsl:for-each select="galery/flower">
						<tr>
							<td>
								<xsl:value-of select="name" />
							</td>
							<td>
								<xsl:value-of select="soil" />
							</td>
							<td>
								<xsl:value-of select="origin" />
							</td>
							<td>
								<xsl:value-of select="visualParametrs/colour" />
							</td>
							<td>
								<xsl:value-of select="visualParametrs/length" />
							</td>
							<td>
								<xsl:value-of select="growingTips/temperature" />
							</td>
							<td>
								<xsl:value-of select="growingTips/watering" />
							</td>
							<td>
								<xsl:value-of select="multiplying" />
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>