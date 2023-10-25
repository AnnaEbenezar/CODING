<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Me.Label1 = New System.Windows.Forms.Label()
        Me.tbID = New System.Windows.Forms.TextBox()
        Me.Table1BindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.Database3DataSet = New Practical_Test_2.Database3DataSet()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.tbFN = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.tbLN = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.tbD = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.tbHW = New System.Windows.Forms.TextBox()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.tbWH = New System.Windows.Forms.TextBox()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.tbGE = New System.Windows.Forms.TextBox()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.calc = New System.Windows.Forms.Button()
        Me.DataGridView1 = New System.Windows.Forms.DataGridView()
        Me.IDDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.FirstNameDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.LastNameDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DepartmentDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.HourlyWageDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.WeeklyHoursDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.Table1TableAdapter = New Practical_Test_2.Database3DataSetTableAdapters.Table1TableAdapter()
        Me.BindingNavigator1 = New System.Windows.Forms.BindingNavigator(Me.components)
        Me.BindingNavigatorAddNewItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorCountItem = New System.Windows.Forms.ToolStripLabel()
        Me.BindingNavigatorDeleteItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorMoveFirstItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorMovePreviousItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorSeparator = New System.Windows.Forms.ToolStripSeparator()
        Me.BindingNavigatorPositionItem = New System.Windows.Forms.ToolStripTextBox()
        Me.BindingNavigatorSeparator1 = New System.Windows.Forms.ToolStripSeparator()
        Me.BindingNavigatorMoveNextItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorMoveLastItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorSeparator2 = New System.Windows.Forms.ToolStripSeparator()
        CType(Me.Table1BindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.Database3DataSet, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.BindingNavigator1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.BindingNavigator1.SuspendLayout()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(227, 85)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(18, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "ID"
        '
        'tbID
        '
        Me.tbID.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.Table1BindingSource, "ID", True))
        Me.tbID.Location = New System.Drawing.Point(322, 82)
        Me.tbID.Name = "tbID"
        Me.tbID.Size = New System.Drawing.Size(100, 20)
        Me.tbID.TabIndex = 1
        '
        'Table1BindingSource
        '
        Me.Table1BindingSource.DataMember = "Table1"
        Me.Table1BindingSource.DataSource = Me.Database3DataSet
        '
        'Database3DataSet
        '
        Me.Database3DataSet.DataSetName = "Database3DataSet"
        Me.Database3DataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(227, 111)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(57, 13)
        Me.Label2.TabIndex = 0
        Me.Label2.Text = "First Name"
        '
        'tbFN
        '
        Me.tbFN.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.Table1BindingSource, "First Name", True))
        Me.tbFN.Location = New System.Drawing.Point(322, 108)
        Me.tbFN.Name = "tbFN"
        Me.tbFN.Size = New System.Drawing.Size(100, 20)
        Me.tbFN.TabIndex = 1
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(227, 137)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(58, 13)
        Me.Label3.TabIndex = 0
        Me.Label3.Text = "Last Name"
        '
        'tbLN
        '
        Me.tbLN.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.Table1BindingSource, "Last Name", True))
        Me.tbLN.Location = New System.Drawing.Point(322, 134)
        Me.tbLN.Name = "tbLN"
        Me.tbLN.Size = New System.Drawing.Size(100, 20)
        Me.tbLN.TabIndex = 1
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(227, 163)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(62, 13)
        Me.Label4.TabIndex = 0
        Me.Label4.Text = "Department"
        '
        'tbD
        '
        Me.tbD.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.Table1BindingSource, "Department", True))
        Me.tbD.Location = New System.Drawing.Point(322, 160)
        Me.tbD.Name = "tbD"
        Me.tbD.Size = New System.Drawing.Size(100, 20)
        Me.tbD.TabIndex = 1
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(227, 189)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(74, 13)
        Me.Label5.TabIndex = 0
        Me.Label5.Text = "Hourly Wages"
        '
        'tbHW
        '
        Me.tbHW.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.Table1BindingSource, "Hourly Wage", True))
        Me.tbHW.Location = New System.Drawing.Point(322, 186)
        Me.tbHW.Name = "tbHW"
        Me.tbHW.Size = New System.Drawing.Size(100, 20)
        Me.tbHW.TabIndex = 1
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(227, 215)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(74, 13)
        Me.Label6.TabIndex = 0
        Me.Label6.Text = "Weekly Hours"
        '
        'tbWH
        '
        Me.tbWH.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.Table1BindingSource, "Weekly Hours", True))
        Me.tbWH.Location = New System.Drawing.Point(322, 212)
        Me.tbWH.Name = "tbWH"
        Me.tbWH.Size = New System.Drawing.Size(100, 20)
        Me.tbWH.TabIndex = 1
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(227, 241)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(78, 13)
        Me.Label7.TabIndex = 0
        Me.Label7.Text = "Gross Earnings"
        '
        'tbGE
        '
        Me.tbGE.Location = New System.Drawing.Point(322, 238)
        Me.tbGE.Name = "tbGE"
        Me.tbGE.Size = New System.Drawing.Size(100, 20)
        Me.tbGE.TabIndex = 1
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(268, 42)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(113, 13)
        Me.Label8.TabIndex = 0
        Me.Label8.Text = "EMPLOYEE DETAILS"
        '
        'calc
        '
        Me.calc.Location = New System.Drawing.Point(460, 231)
        Me.calc.Name = "calc"
        Me.calc.Size = New System.Drawing.Size(81, 23)
        Me.calc.TabIndex = 2
        Me.calc.Text = "CALCULATE"
        Me.calc.UseVisualStyleBackColor = True
        '
        'DataGridView1
        '
        Me.DataGridView1.AutoGenerateColumns = False
        Me.DataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.DataGridView1.Columns.AddRange(New System.Windows.Forms.DataGridViewColumn() {Me.IDDataGridViewTextBoxColumn, Me.FirstNameDataGridViewTextBoxColumn, Me.LastNameDataGridViewTextBoxColumn, Me.DepartmentDataGridViewTextBoxColumn, Me.HourlyWageDataGridViewTextBoxColumn, Me.WeeklyHoursDataGridViewTextBoxColumn})
        Me.DataGridView1.DataSource = Me.Table1BindingSource
        Me.DataGridView1.Location = New System.Drawing.Point(169, 273)
        Me.DataGridView1.Name = "DataGridView1"
        Me.DataGridView1.Size = New System.Drawing.Size(439, 150)
        Me.DataGridView1.TabIndex = 3
        '
        'IDDataGridViewTextBoxColumn
        '
        Me.IDDataGridViewTextBoxColumn.DataPropertyName = "ID"
        Me.IDDataGridViewTextBoxColumn.HeaderText = "ID"
        Me.IDDataGridViewTextBoxColumn.Name = "IDDataGridViewTextBoxColumn"
        '
        'FirstNameDataGridViewTextBoxColumn
        '
        Me.FirstNameDataGridViewTextBoxColumn.DataPropertyName = "First Name"
        Me.FirstNameDataGridViewTextBoxColumn.HeaderText = "First Name"
        Me.FirstNameDataGridViewTextBoxColumn.Name = "FirstNameDataGridViewTextBoxColumn"
        '
        'LastNameDataGridViewTextBoxColumn
        '
        Me.LastNameDataGridViewTextBoxColumn.DataPropertyName = "Last Name"
        Me.LastNameDataGridViewTextBoxColumn.HeaderText = "Last Name"
        Me.LastNameDataGridViewTextBoxColumn.Name = "LastNameDataGridViewTextBoxColumn"
        '
        'DepartmentDataGridViewTextBoxColumn
        '
        Me.DepartmentDataGridViewTextBoxColumn.DataPropertyName = "Department"
        Me.DepartmentDataGridViewTextBoxColumn.HeaderText = "Department"
        Me.DepartmentDataGridViewTextBoxColumn.Name = "DepartmentDataGridViewTextBoxColumn"
        '
        'HourlyWageDataGridViewTextBoxColumn
        '
        Me.HourlyWageDataGridViewTextBoxColumn.DataPropertyName = "Hourly Wage"
        Me.HourlyWageDataGridViewTextBoxColumn.HeaderText = "Hourly Wage"
        Me.HourlyWageDataGridViewTextBoxColumn.Name = "HourlyWageDataGridViewTextBoxColumn"
        '
        'WeeklyHoursDataGridViewTextBoxColumn
        '
        Me.WeeklyHoursDataGridViewTextBoxColumn.DataPropertyName = "Weekly Hours"
        Me.WeeklyHoursDataGridViewTextBoxColumn.HeaderText = "Weekly Hours"
        Me.WeeklyHoursDataGridViewTextBoxColumn.Name = "WeeklyHoursDataGridViewTextBoxColumn"
        '
        'Table1TableAdapter
        '
        Me.Table1TableAdapter.ClearBeforeFill = True
        '
        'BindingNavigator1
        '
        Me.BindingNavigator1.AddNewItem = Me.BindingNavigatorAddNewItem
        Me.BindingNavigator1.BindingSource = Me.Table1BindingSource
        Me.BindingNavigator1.CountItem = Me.BindingNavigatorCountItem
        Me.BindingNavigator1.DeleteItem = Me.BindingNavigatorDeleteItem
        Me.BindingNavigator1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.BindingNavigatorMoveFirstItem, Me.BindingNavigatorMovePreviousItem, Me.BindingNavigatorSeparator, Me.BindingNavigatorPositionItem, Me.BindingNavigatorCountItem, Me.BindingNavigatorSeparator1, Me.BindingNavigatorMoveNextItem, Me.BindingNavigatorMoveLastItem, Me.BindingNavigatorSeparator2, Me.BindingNavigatorAddNewItem, Me.BindingNavigatorDeleteItem})
        Me.BindingNavigator1.Location = New System.Drawing.Point(0, 0)
        Me.BindingNavigator1.MoveFirstItem = Me.BindingNavigatorMoveFirstItem
        Me.BindingNavigator1.MoveLastItem = Me.BindingNavigatorMoveLastItem
        Me.BindingNavigator1.MoveNextItem = Me.BindingNavigatorMoveNextItem
        Me.BindingNavigator1.MovePreviousItem = Me.BindingNavigatorMovePreviousItem
        Me.BindingNavigator1.Name = "BindingNavigator1"
        Me.BindingNavigator1.PositionItem = Me.BindingNavigatorPositionItem
        Me.BindingNavigator1.Size = New System.Drawing.Size(800, 25)
        Me.BindingNavigator1.TabIndex = 4
        Me.BindingNavigator1.Text = "BindingNavigator1"
        '
        'BindingNavigatorAddNewItem
        '
        Me.BindingNavigatorAddNewItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorAddNewItem.Image = CType(resources.GetObject("BindingNavigatorAddNewItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorAddNewItem.Name = "BindingNavigatorAddNewItem"
        Me.BindingNavigatorAddNewItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorAddNewItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorAddNewItem.Text = "Add new"
        '
        'BindingNavigatorCountItem
        '
        Me.BindingNavigatorCountItem.Name = "BindingNavigatorCountItem"
        Me.BindingNavigatorCountItem.Size = New System.Drawing.Size(35, 22)
        Me.BindingNavigatorCountItem.Text = "of {0}"
        Me.BindingNavigatorCountItem.ToolTipText = "Total number of items"
        '
        'BindingNavigatorDeleteItem
        '
        Me.BindingNavigatorDeleteItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorDeleteItem.Image = CType(resources.GetObject("BindingNavigatorDeleteItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorDeleteItem.Name = "BindingNavigatorDeleteItem"
        Me.BindingNavigatorDeleteItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorDeleteItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorDeleteItem.Text = "Delete"
        '
        'BindingNavigatorMoveFirstItem
        '
        Me.BindingNavigatorMoveFirstItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMoveFirstItem.Image = CType(resources.GetObject("BindingNavigatorMoveFirstItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMoveFirstItem.Name = "BindingNavigatorMoveFirstItem"
        Me.BindingNavigatorMoveFirstItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMoveFirstItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorMoveFirstItem.Text = "Move first"
        '
        'BindingNavigatorMovePreviousItem
        '
        Me.BindingNavigatorMovePreviousItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMovePreviousItem.Image = CType(resources.GetObject("BindingNavigatorMovePreviousItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMovePreviousItem.Name = "BindingNavigatorMovePreviousItem"
        Me.BindingNavigatorMovePreviousItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMovePreviousItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorMovePreviousItem.Text = "Move previous"
        '
        'BindingNavigatorSeparator
        '
        Me.BindingNavigatorSeparator.Name = "BindingNavigatorSeparator"
        Me.BindingNavigatorSeparator.Size = New System.Drawing.Size(6, 25)
        '
        'BindingNavigatorPositionItem
        '
        Me.BindingNavigatorPositionItem.AccessibleName = "Position"
        Me.BindingNavigatorPositionItem.AutoSize = False
        Me.BindingNavigatorPositionItem.Font = New System.Drawing.Font("Segoe UI", 9.0!)
        Me.BindingNavigatorPositionItem.Name = "BindingNavigatorPositionItem"
        Me.BindingNavigatorPositionItem.Size = New System.Drawing.Size(50, 23)
        Me.BindingNavigatorPositionItem.Text = "0"
        Me.BindingNavigatorPositionItem.ToolTipText = "Current position"
        '
        'BindingNavigatorSeparator1
        '
        Me.BindingNavigatorSeparator1.Name = "BindingNavigatorSeparator1"
        Me.BindingNavigatorSeparator1.Size = New System.Drawing.Size(6, 25)
        '
        'BindingNavigatorMoveNextItem
        '
        Me.BindingNavigatorMoveNextItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMoveNextItem.Image = CType(resources.GetObject("BindingNavigatorMoveNextItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMoveNextItem.Name = "BindingNavigatorMoveNextItem"
        Me.BindingNavigatorMoveNextItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMoveNextItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorMoveNextItem.Text = "Move next"
        '
        'BindingNavigatorMoveLastItem
        '
        Me.BindingNavigatorMoveLastItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMoveLastItem.Image = CType(resources.GetObject("BindingNavigatorMoveLastItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMoveLastItem.Name = "BindingNavigatorMoveLastItem"
        Me.BindingNavigatorMoveLastItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMoveLastItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorMoveLastItem.Text = "Move last"
        '
        'BindingNavigatorSeparator2
        '
        Me.BindingNavigatorSeparator2.Name = "BindingNavigatorSeparator2"
        Me.BindingNavigatorSeparator2.Size = New System.Drawing.Size(6, 25)
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.BindingNavigator1)
        Me.Controls.Add(Me.DataGridView1)
        Me.Controls.Add(Me.calc)
        Me.Controls.Add(Me.tbGE)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.tbWH)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.tbHW)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.tbD)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.tbLN)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.tbFN)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.tbID)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.Table1BindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.Database3DataSet, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.BindingNavigator1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.BindingNavigator1.ResumeLayout(False)
        Me.BindingNavigator1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents tbID As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents tbFN As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents tbLN As TextBox
    Friend WithEvents Label4 As Label
    Friend WithEvents tbD As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents tbHW As TextBox
    Friend WithEvents Label6 As Label
    Friend WithEvents tbWH As TextBox
    Friend WithEvents Label7 As Label
    Friend WithEvents tbGE As TextBox
    Friend WithEvents Label8 As Label
    Friend WithEvents calc As Button
    Friend WithEvents DataGridView1 As DataGridView
    Friend WithEvents Database3DataSet As Database3DataSet
    Friend WithEvents Table1BindingSource As BindingSource
    Friend WithEvents Table1TableAdapter As Database3DataSetTableAdapters.Table1TableAdapter
    Friend WithEvents IDDataGridViewTextBoxColumn As DataGridViewTextBoxColumn
    Friend WithEvents FirstNameDataGridViewTextBoxColumn As DataGridViewTextBoxColumn
    Friend WithEvents LastNameDataGridViewTextBoxColumn As DataGridViewTextBoxColumn
    Friend WithEvents DepartmentDataGridViewTextBoxColumn As DataGridViewTextBoxColumn
    Friend WithEvents HourlyWageDataGridViewTextBoxColumn As DataGridViewTextBoxColumn
    Friend WithEvents WeeklyHoursDataGridViewTextBoxColumn As DataGridViewTextBoxColumn
    Friend WithEvents BindingNavigator1 As BindingNavigator
    Friend WithEvents BindingNavigatorAddNewItem As ToolStripButton
    Friend WithEvents BindingNavigatorCountItem As ToolStripLabel
    Friend WithEvents BindingNavigatorDeleteItem As ToolStripButton
    Friend WithEvents BindingNavigatorMoveFirstItem As ToolStripButton
    Friend WithEvents BindingNavigatorMovePreviousItem As ToolStripButton
    Friend WithEvents BindingNavigatorSeparator As ToolStripSeparator
    Friend WithEvents BindingNavigatorPositionItem As ToolStripTextBox
    Friend WithEvents BindingNavigatorSeparator1 As ToolStripSeparator
    Friend WithEvents BindingNavigatorMoveNextItem As ToolStripButton
    Friend WithEvents BindingNavigatorMoveLastItem As ToolStripButton
    Friend WithEvents BindingNavigatorSeparator2 As ToolStripSeparator
End Class
