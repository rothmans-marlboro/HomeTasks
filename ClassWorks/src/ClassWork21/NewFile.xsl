<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<head>Point List</head>
			<body>
				<table border="1">
					<tr align="center">
						<th rowspan="1">Point x</th>
						<th rowspan="1">Point y</th>
						<th rowspan="1">Units</th>
					</tr>
					<xsl:for-each select="pointList/point">
						<tr>
							<td>
								<xsl:value-of select="x" />
							</td>
							<td>
								<xsl:value-of select="y" />
							</td>
							<td>
								<xsl:value-of select="unit" />
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>